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
        Nodo nuevo = new Nodo(elem); 
        if(this.longitud == 0){         
            this.ultimo = nuevo;
            this.primero =nuevo;
            nuevo.sig = null;
            nuevo.ant = null;
            longitud = 1;
        }

        else {
            nuevo.sig = primero;
            nuevo.ant = null;
            primero = nuevo ;
            longitud ++;
        }
    }

    public void agregarAtras(T elem) {

        Nodo nuevoUltimo = new Nodo(elem);
        if(this.longitud == 0){
            this.primero = nuevoUltimo;
            this.ultimo = nuevoUltimo;
            nuevoUltimo.sig = null;
            nuevoUltimo.ant = null;
            longitud = 1;
        }
        else{
            Nodo actual = primero;
            while (actual.sig != null){
                actual = actual.sig;
            }
            actual.sig =nuevoUltimo;
            
            nuevoUltimo.sig = null;
            nuevoUltimo.ant = actual;
            longitud++;
            
        }



    }

    public T obtener(int i) {
        Nodo actual = this.primero;

        for(int j =0;j<i;j++){
            actual = actual.sig;
        }
        return actual.valor;
    }

    public void eliminar(int i) {
        Nodo actual = primero;
        Nodo prev = primero;

        for (int j=0;j<i;j++){
            prev = actual;
            actual = actual.sig;
        }
        if (i == 0){
            primero = actual.sig;
            if(primero != null){
                primero.ant = null;
            } else {
                ultimo = null;
            }
        }   else {
            prev.sig =actual.sig;
            if(actual.sig !=null){
                actual.sig.ant =prev;
            } else{
                ultimo =prev;
            }
        }
        longitud --;

    }

    public void modificarPosicion(int indice, T elem) {
        Nodo actual =primero;
        for (int j = 0 ; j<indice; j ++){
            actual=actual.sig;
        }
        actual.valor = elem;
    }

    public ListaEnlazada(ListaEnlazada<T> lista) {
        Nodo actual = lista.primero;
        while(actual != null){
            agregarAtras(actual.valor);
            actual=actual.sig;
        }
    }
    
    @Override
    public String toString() {
        String res = "[";
        Nodo Actual = primero;
        while (Actual != null) { 
            res += Actual.valor;
            if(Actual.sig != null){
                res += ", ";
            }
            Actual= Actual.sig;
        }
        res += "]";

        return  res;
    }

    public class ListaIterador implements  Iterador<T>{
    	int dedito;

        ListaIterador() {
            dedito = 0;
        }
        
        public boolean haySiguiente() {
	        return dedito < longitud;
        }
        
        public boolean hayAnterior() {
	        return dedito > 0;
        }

        public T siguiente() {
	       Nodo actual = primero;
           for (int i = 0;i<dedito; i++){
            actual = actual.sig;
           }
           dedito ++;
           return actual.valor;
        }
        

        public T anterior() {
	        Nodo actual = primero;
            dedito = dedito -1;
            for (int i = 0;i<dedito; i++){
            actual = actual.sig;
           }
           return  actual.valor;
        }
    }

    public ListaIterador iterador() {
	    return new ListaIterador();
    }

}
