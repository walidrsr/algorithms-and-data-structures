package aed;

public class ListaEnlazada<T> implements Secuencia<T> {
    private Nodo primero;
    private Nodo ultimo;
    private int longitud;


    private class Nodo {
        T valor;
        Nodo sig;
        Nodo ant; 

        Nodo(T v){
            valor = v;
        }
    }   

    public ListaEnlazada() {    
        this.primero = null;
        this.ultimo = null;
        this.longitud = 0;
    }

    public int longitud() {
        return this.longitud;
    }    

    public void agregarAdelante(T elem) {
        ;
    }

    public void agregarAtras(T elem) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public T obtener(int i) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void eliminar(int i) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void modificarPosicion(int indice, T elem) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public ListaEnlazada(ListaEnlazada<T> lista) {
        throw new UnsupportedOperationException("No implementada aun");
    }
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public class ListaIterador{
    	// Completar atributos privados

        public boolean haySiguiente() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
        
        public boolean hayAnterior() {
	        throw new UnsupportedOperationException("No implementada aun");
        }

        public T siguiente() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
        

        public T anterior() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
    }

    public ListaIterador iterador() {
	    throw new UnsupportedOperationException("No implementada aun");
    }

}
