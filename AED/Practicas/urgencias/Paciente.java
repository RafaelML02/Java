package aed.urgencias;

import java.util.Objects;

/**
 * Un paciente.
 */
public class Paciente implements Comparable<Paciente> {

  // DNI
  private String DNI;
  // Prioridad 
  private int prioridad;
  // Tiempo de admision en las urgencias
  private int tiempoAdmision;
  // Tiempo cuando entro en la prioridad 
  private int tiempoAdmisionEnPrioridad;

  /**
   * Constructor.
   */
  public Paciente(String DNI, int prioridad, int tiempoAdmision, int tiempoAdmisionEnPrioridad) {
    this.DNI = DNI;
    this.prioridad = prioridad;
    this.tiempoAdmision = tiempoAdmision;
    this.tiempoAdmisionEnPrioridad = tiempoAdmisionEnPrioridad;
  }

  /**
   * Devuelve el dni.
   * @return el dni.
   */
  public String getDNI() {
    return DNI;
  }

  /**
   * Devuelve la prioridad.
   * @return la prioridad.
   */
  public int getPrioridad() {
    return prioridad;
  }

  /**
   * Devuelve el tiempo de admision.
   * @return el tiempo de admision.
   */
  public int getTiempoAdmision() {
    return tiempoAdmision;
  }

  /**
   * Devuelve el tiempo de admision en la prioridad actual.
   * @return el tiempo de admision en la prioridad actual.
   */
  public int getTiempoAdmisionEnPrioridad() {
    return tiempoAdmisionEnPrioridad;
  }

  /**
   * Asigna una prioridad nueva.
   * @return la prioridad antigua.
   */
  public int setPrioridad(int prioridadNuevo) {
    int oldPrioridad = prioridad;
    prioridad = prioridadNuevo;
    return oldPrioridad;
  }

  /**
   * Asigna un nuevo tiempo de admision en prioridad.
   * @return el tiempo de admision en prioridad antigua.
   */
  public int setTiempoAdmisionEnPrioridad(int tiempoNuevo) {
    int oldTiempo = tiempoAdmisionEnPrioridad;
    tiempoAdmisionEnPrioridad = tiempoNuevo;
    return oldTiempo;
  }

  @Override
  public String toString() {
     return "<\""+DNI.toString()+"\","+prioridad+","+tiempoAdmision+","+tiempoAdmisionEnPrioridad+">";
  }

  // ----------------------------------------------------------------------
  // Para terminar

  // Hay que definir compareTo:
  // (ve la descripcion en la guia)
  @Override
  public int compareTo(Paciente paciente) {
	  int num=0;
	  if (this.prioridad > paciente.getPrioridad() ) {
		  num = 1;
	  }
	  else if( this.prioridad < paciente.getPrioridad()) { 
		  num = -1;
	  }
	  else {
		  if (this.tiempoAdmisionEnPrioridad > paciente.getTiempoAdmisionEnPrioridad()) {
	            num = 1;
	        } else if (this.tiempoAdmisionEnPrioridad < paciente.getTiempoAdmisionEnPrioridad()) {
	            num = -1;
	        } else {
	        	if(this.tiempoAdmision > paciente.getTiempoAdmision()) {
	        		num=1;
	        	} else {
	        		num=-1;
	        	}
	        }
	    }
	  return num;
  }

  
  // Hay que definir equals
  // Usad solo el DNI al comparar pacientes
  @Override
  public boolean equals(Object obj) {
	  boolean res = true;
	  if(this == obj) { 
		  res=true;
	  }
	  else if (obj == null || getClass() != obj.getClass() ) {
		  res=false;
	  }
    return res;
  }

  // Hay que definit hashCode
  // Usad solo el DNI al calcular el hashCode
  @Override
  public int hashCode() {
	  return this.getDNI().hashCode();
  }
}




