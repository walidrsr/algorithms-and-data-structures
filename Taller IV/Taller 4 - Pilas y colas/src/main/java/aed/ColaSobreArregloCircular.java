package aed;

public class ColaSobreArregloCircular implements Cola {
    private int[] array;
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    public ColaSobreArregloCircular(int i) {
       array = new int[i];
    }

    // Inserta en el final (tail)
    public void enqueue(int elem) {
        if (isFull()){
            throw new RuntimeException("overflow");
        }

        array[tail] = elem;
        tail = (tail +1) % array.length;
        size ++;
        
    }

    // Obtiene el elemento del frente (head)
    public int dequeue() {
          if (isEmpty()){
            throw new RuntimeException("overflow");
        }
        int elem = array[head];
        head = (head+1)% array.length;
        size --;
        return elem;
    }

    // Obtiene el elemento del frente (head)
    public int front() {
        return array[head];
    }

    // Obtiene el elemento del final (tail)
    public int rear() {
        return array[(tail-1 + array.length) % array.length];
    }

    public boolean isEmpty() {
       return size == 0;
    }

    public boolean isFull() {
        return size == array.length;
    }
}
