package Singly_Linked_List;


public class Homework1 {

    public class Node {

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public Homework1() {
        this.head = null;
    }

    //오른쪽 삽입
    public void append(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(value);
    }

    //왼쪽 삽입
    public void prepend(int value) {
        //새로운 노드 생성
        Node newHead = new Node(value);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int value) {
        if (head == null) {
            return;
        }
        if (head.value == value) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public Node find(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public void printList(){
        Node current = head;
        while(current !=null){
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Homework1 list = new Homework1();
        list.append(1);
        list.append(2);
        list.append(3);
        list.printList();
    }

}


