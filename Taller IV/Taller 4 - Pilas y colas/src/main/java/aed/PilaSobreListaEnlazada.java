package aed;

public class PilaSobreListaEnlazada implements Pila {
    private Node top;
    public PilaSobreListaEnlazada() {
        top =null;
    }

    public void push(int elem) {
        Node newNode = new Node(elem);
        newNode.next = top;
        top= newNode;
    }

    public int pop() {
        int elem = top.data;
        top = top.next;
        return elem;
    }

    public int top() {
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public boolean isFull() {
        return false;
    }
}
