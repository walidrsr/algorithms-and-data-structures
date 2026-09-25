package aed;

public class ColaSobreListaEnlazada implements Cola {

    private Node head;
    private Node tail;

    public ColaSobreListaEnlazada() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int elem) {
        Node nuevNode = new Node(elem);
        if(head == null){
            head = nuevNode;
            tail = nuevNode;}

        else{
            tail.next=nuevNode;
            tail = nuevNode;
        }
    }

    public int dequeue() {
        Node cabezaAnterior = this.head;
        this.head= this.head.next;

        return cabezaAnterior.data;
    }

    public int front() {

        return head.data;
    }

    public int rear() {
        return tail.data;
    }

    public boolean isEmpty() {
        return this.head ==  null;     
    }

    public boolean isFull() {
        return false;
    }
}
