package aed;

public class PilaSobreArreglo implements Pila {
    private int[] array;
    private int indiceTop;

    public PilaSobreArreglo(int capacity) {
        array  = new int[capacity];
        indiceTop = -1;
    }

    public void push(int elem) {
        indiceTop = indiceTop +1;
        array[indiceTop] = elem;
    }

    public int pop() {
        int elem = array[indiceTop];
        indiceTop = indiceTop -1;
        return elem;
        
    }

    public int top() {
       return array[indiceTop];
    }

    public boolean isEmpty() {
        return indiceTop == -1;
    }

    public boolean isFull() {
      return indiceTop == array.length -1;
    }
}
