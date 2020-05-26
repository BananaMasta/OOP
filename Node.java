package OOP.model;

public class Node<T> {

    Node<T> next, previous;
    T value;

    public Node() {
        next = null;
        previous = null;
        value = null;
    }

    public Node(T value) {
        this.value = value;
    }

}
