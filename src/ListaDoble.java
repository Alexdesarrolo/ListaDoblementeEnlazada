public class ListaDoble {
    private Nodo inicio;

    public ListaDoble() {
        this.inicio = null;
    }

    public void insertarFinal(Integer d) {
        Nodo nuevo = new Nodo(d);
        if (inicio == null) {
            // La lista estaba vacía
            inicio = nuevo;
        } else {
            // La lista no estaba vacía
            Nodo aux = inicio;
            while (aux.siguiente != null) {
                aux = aux.siguiente; // Navegar al último nodo
            }
            aux.siguiente = nuevo; // El último nodo ahora apunta al nuevo nodo
            nuevo.anterior = aux;   // El nuevo nodo apunta hacia atrás al antiguo último nodo
        }
    }

    public void imprimirCola() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.print(aux.dato + " "); // Imprimir el dato del nodo actual
            aux = aux.siguiente; // Mover al siguiente nodo
        }
        System.out.println(); 
    }

    public void imprimirPila() {
        if (inicio == null) {
            return; 
        }
        
        // Navegar hasta el último nodo
        Nodo aux = inicio;
        while (aux.siguiente != null) {
            aux = aux.siguiente;
        }
        
        // Ahora recorrer hacia atrás
        while (aux != null) {
            System.out.print(aux.dato + " "); // Imprimir el dato del nodo actual
            aux = aux.anterior; // Mover al nodo anterior
        }
        System.out.println();
    }
}
