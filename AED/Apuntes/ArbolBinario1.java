
class NodoArbol {
    int valor;
    NodoArbol izquierdo, derecho;

    public NodoArbol(int valor) {
        this.valor = valor;
        this.izquierdo = this.derecho = null;
    }
}

public class ArbolBinario1 {
    private NodoArbol raiz;

    // Constructor
    public ArbolBinario1() {
        raiz = null;
    }

    // Método para encontrar el nodo más a la derecha en un nivel específico
    public NodoArbol obtenerNodoMasDerechaEnNivel(int nivel) {
        return obtenerNodoMasDerechaEnNivel(raiz, nivel, 1);
    }

    private NodoArbol obtenerNodoMasDerechaEnNivel(NodoArbol nodo, int nivelObjetivo, int nivelActual) {
        // Verifica si el nodo actual es null
        if (nodo != null) {
            // Si alcanzamos el nivel objetivo, este nodo es candidato a ser el más a la derecha
            if (nivelActual == nivelObjetivo) {
                return nodo;
            }

            // Llama recursivamente a la función para los hijos derecho e izquierdo
            // Incrementa el nivel actual solo cuando descendemos al siguiente nivel
            NodoArbol nodoDerecho = obtenerNodoMasDerechaEnNivel(nodo.derecho, nivelObjetivo, nivelActual + 1);
            NodoArbol nodoIzquierdo = obtenerNodoMasDerechaEnNivel(nodo.izquierdo, nivelObjetivo, nivelActual + 1);

            // Retorna el nodo más a la derecha entre los hijos derecho e izquierdo
            return (nodoDerecho != null) ? nodoDerecho : nodoIzquierdo;
        }
        return null; // Valor de retorno para un árbol vacío o nivel no encontrado
    }

    // Método de prueba
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.raiz = new NodoArbol(1);
        arbol.raiz.izquierdo = new NodoArbol(2);
        arbol.raiz.derecho = new NodoArbol(3);
        arbol.raiz.izquierdo.izquierdo = new NodoArbol(4);
        arbol.raiz.izquierdo.derecho = new NodoArbol(5);
        arbol.raiz.derecho.izquierdo = new NodoArbol(6);

        int nivelObjetivo = 3; // Cambia este valor al nivel que te interese

        NodoArbol nodoMasDerecha = arbol.obtenerNodoMasDerechaEnNivel(nivelObjetivo);

        if (nodoMasDerecha != null) {
            System.out.println("Valor del nodo más a la derecha en el nivel " + nivelObjetivo + ": " + nodoMasDerecha.valor);
        } else {
            System.out.println("Nivel no encontrado o árbol vacío.");
        }
    }
}



}
