
public class Ajedrez {
    public static void main(String[] args) {
        Ajedrez ajedrez = new Ajedrez();
        int x = 3;
        int y = 5;
        int xReina = 6;
        int yReina = 2;
        boolean amenazada = ajedrez.esCuadroAmenazado(x, y, xReina, yReina);
        System.out.println("¿La casilla está amenazada por la reina? " + amenazada);
    }

    public boolean esCuadroAmenazado(int x, int y, int xReina, int yReina) {
        // Verificar si las coordenadas son válidas (dentro del tablero)
        if (x < 0 || x > 7 || y < 0 || y > 7 || xReina < 0 || xReina > 7 || yReina < 0 || yReina > 7) {
            throw new IllegalArgumentException("Coordenadas fuera de rango (0-7).");
        }

        // Verificar si la casilla está en la misma fila, columna o diagonal que la reina
        return x == xReina || y == yReina || Math.abs(x - xReina) == Math.abs(y - yReina);
    }
}
