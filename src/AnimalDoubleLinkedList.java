public class AnimalDoubleLinkedList {
    private Node head;
    private Node tail;

    public void add(Zvire zvire) {
        Node newNode = new Node(zvire);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public void addFirst(Zvire zvire) {
        Node newNode = new Node(zvire);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else {
            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void printAll() throws InterruptedException {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            Thread.sleep(1000);
            System.out.println(current.getData().toString());
            current = current.getNext();
        }
    }

    public void removeFirst(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.getNext();
        head.setPrev(null);
    }

    public void printAllOverFiveYo() throws InterruptedException {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            if (current.getData().getVek() >= 5){
                Thread.sleep(1000);
                System.out.println(current.getData().toString());
            }
            current = current.getNext();
        }
    }

    public void printTheOldestAnimal() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node oldest = head;
        Node current = head;
        while (current != null) {
            if  (oldest.getData().getVek() < current.getData().getVek()) {
                oldest = current;
            }
            current = current.getNext();
        }
        System.out.println(oldest.getData().toString());
    }
}
