package aed.hotel;

import java.util.Comparator;

import es.upm.aedlib.indexedlist.*;

/**
 * Implementa el interfaz Hotel, para realisar y cancelar reservas en un hotel,
 * y para realisar preguntas sobre reservas en vigor.
 */
public class MiHotel implements Hotel {
	/**
	 * Usa esta estructura para guardar las habitaciones creados.
	 */
	private IndexedList<Habitacion> habitaciones;

	/**
	 * Crea una instancia del hotel.
	 */
	  public MiHotel() {
		    // No se debe cambiar este codigo
		    this.habitaciones = new ArrayIndexedList<>();
		  }


	@Override
	public void anadirHabitacion(Habitacion habitacion) throws IllegalArgumentException {
		Comparator<Habitacion> cmp = new CompararNombreHabitaciones();
		if (buscaHabitacionIndice(habitacion.getNombre()) != -1)
			throw new IllegalArgumentException("La habitacion no se puede a adir.");

		insertar(habitacion, habitaciones, cmp);

	}


	public boolean reservaHabitacion(Reserva reserva) throws IllegalArgumentException{
		int index = buscaHabitacionIndice(reserva.getHabitacion());
		if (index == -1)
			throw new IllegalArgumentException();
		Habitacion habitacion = habitaciones.get(index);
		IndexedList<Reserva> reservas = habitacion.getReservas();
		if (habitacionDisponible(reserva.getHabitacion(), reserva.getDiaEntrada(), reserva.getDiaSalida())) {
			añadirReserva(reserva, reservas);
			return true;
		} else {
			return false;

		}
	}

	private void añadirReserva(Reserva reserva, IndexedList<Reserva> reservas) {
		boolean fin = false;
		if(reservas.size() == 0) {
			reservas.add(0, reserva);
			return;
		}
		
		for (int i=0; i<reservas.size() && !fin; i++) {
			Reserva actual = reservas.get(i);
			if (actual.getDiaEntrada().compareTo(reserva.getDiaSalida())>0) {
				reservas.add(i, reserva);
				fin = true;
			}
		}
		
		if (!fin) reservas.add(reservas.size(), reserva);
	}

	
	public boolean cancelarReserva(Reserva reserva) throws IllegalArgumentException{
		int index = buscaHabitacionIndice(reserva.getHabitacion());
		if (index == -1)
			throw new IllegalArgumentException();
		Habitacion habitacion = habitaciones.get(index);
		IndexedList<Reserva> reservas = habitacion.getReservas();
		
		boolean cancelada = false;
		for (int i = 0; i < reservas.size() && !cancelada; i++) {
			Reserva reserva1 = reservas.get(i);
			if (reserva1.equals(reserva)) {
				reservas.remove(reserva);
				cancelada = true;
			}
		}
		return cancelada;
	}


	@Override
	public IndexedList<Habitacion> disponibilidadHabitaciones(String diaEntrada, String diaSalida) {
		Comparator<Habitacion> cmp = new CompararPrecioHabitaciones();
		IndexedList<Habitacion> disponibles = new ArrayIndexedList<>();
		for (Habitacion habitacion : habitaciones) {
			if (habitacionDisponible(habitacion.getNombre(), diaEntrada, diaSalida))
				insertar(habitacion, disponibles, cmp);
		}
		return disponibles;
	}

	private boolean habitacionDisponible(String nombre, String diaEntrada, String diaSalida) throws IllegalArgumentException{
		int index = buscaHabitacionIndice(nombre);
		if (index == -1)
			throw new IllegalArgumentException();
		Habitacion habitacion = habitaciones.get(index);
		
		boolean disponibilidad = true;
		for(int j=0; j<habitacion.getReservas().size() && disponibilidad; j++) {
			disponibilidad = habitacion.getReservas().get(j).getDiaEntrada().compareTo(diaSalida) >= 0 
						|| habitacion.getReservas().get(j).getDiaSalida().compareTo(diaEntrada) <= 0;
		}
				
		return disponibilidad;
	}
	
	
	@Override
	public IndexedList<Reserva> reservasPorCliente(String dniPasaporte) {
		IndexedList<Reserva> reservasPorCliente = new ArrayIndexedList<>();
		Comparator<Reserva> cmp = new ComparadorFechasEntrada();
		for (Habitacion habitacion : habitaciones) {
			for (Reserva reserva : habitacion.getReservas()) {
				if (reserva.getDniPasaporte().equals(dniPasaporte)) {
					insertar(reserva, reservasPorCliente, cmp);
				}
			}
		}
		return reservasPorCliente;
	}
	@Override
	public IndexedList<Habitacion> habitacionesParaLimpiar(String hoyDia) {
		IndexedList<Habitacion> habitacionesParaLimpiar = new ArrayIndexedList<>();
		for (Habitacion habitacion : habitaciones) { // Ya están en orden
			IndexedList<Reserva> reservas = habitacion.getReservas();
			boolean necesitaLimpiar = false;
			for(int i=0; i<reservas.size() && !necesitaLimpiar; i++) {
				necesitaLimpiar = (reservas.get(i).getDiaEntrada().compareTo(hoyDia) < 0 
						&& reservas.get(i).getDiaSalida().compareTo(hoyDia) >= 0);
					
			}
			if (necesitaLimpiar) 
				habitacionesParaLimpiar.add(habitacionesParaLimpiar.size(), habitacion);
		}
		return habitacionesParaLimpiar;
	}
	public Reserva reservaDeHabitacion(String nombreHabitacion, String dia) throws IllegalArgumentException {
		int index = buscaHabitacionIndice(nombreHabitacion);
		if (index == -1) throw new IllegalArgumentException("La habitacion de la reserva no existe.");
		Habitacion habitacion = habitaciones.get(index);
		IndexedList<Reserva> reservas = habitacion.getReservas();
		Reserva res = null;
		for(int i=0; i<reservas.size() && res==null; i++) {
			if (reservas.get(i).getDiaEntrada().compareTo(dia) <= 0 && reservas.get(i).getDiaSalida().compareTo(dia) > 0)
				res = reservas.get(i);
		}
		
		return res;

	}


	private int buscaHabitacionIndice(String nombreHabitacion) {
		int low = 0;
		int high = habitaciones.size() - 1;
		int result = -1;

		while (low <= high && result == -1) {
			int middle = (low + high) / 2;
			Habitacion middleE = habitaciones.get(middle);
			int cmpRes = nombreHabitacion.compareTo(middleE.getNombre());
			if (cmpRes == 0)
				result = middle;
			else if (cmpRes < 0)
				high = middle - 1;
			else
				low = middle + 1;
		}
		return result;
	}


	private static <E> void insertar(E e, IndexedList<E> list, Comparator<E> cmp) {
		int low = 0;
		int high = list.size() - 1;
		boolean insertado = false;

		while (low <= high && !insertado) {
			int middle = (low + high) / 2;
			E middleE = list.get(middle);
			int cmpres = cmp.compare(e, middleE);
			if (cmpres < 0)
				high = middle - 1;
			else // cmpres > 0, nunca va a ser == 0 ya que son elementos únicos
				low = middle + 1;
		}
		list.add(low, e);
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("MIHotel:\n");
		for (int i = 0; i < habitaciones.size(); i++) {
			Habitacion habitacion = habitaciones.get(i);
			result.append("    " + habitacion + "\n");
		}
		return result.toString();
	}

	static class ComparadorFechasEntrada implements Comparator<Reserva> {

		@Override
		public int compare(Reserva o1, Reserva o2) {
			return o1.getDiaEntrada().compareTo(o2.getDiaEntrada());
		}
	}

	static class CompararNombreHabitaciones implements Comparator<Habitacion> {

		@Override
		public int compare(Habitacion o1, Habitacion o2) {
			return o1.getNombre().compareTo(o2.getNombre());
		}

	}

	static class CompararPrecioHabitaciones implements Comparator<Habitacion> {

		@Override
		public int compare(Habitacion o1, Habitacion o2) {
			return o1.getPrecio()-o2.getPrecio();
		}

	}
}

