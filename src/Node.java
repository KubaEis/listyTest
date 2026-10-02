public class Node {
    private Zvire data;
    private Node next;
    private Node prev;

    public Node(Zvire data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Node getPrev() {return prev;}
    public void setPrev(Node prev) {this.prev = prev;}

    public Node getNext() {return next;}
    public void setNext(Node next) {this.next = next;}

    public Zvire getData() {return data;}
    public void setData(Zvire data) {this.data = data;}
}
