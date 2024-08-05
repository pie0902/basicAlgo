package Singly_Linked_List;

public class FirstList {
    //노드 만들기
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    //기본 필드값
    private Node head;
    private int size;
    //노드 초기화
    public FirstList() {
        head = null;
        size = 0;
    }
    //노드 가져오기
    public int get(int index){
        if(index<0||size<=index){
            return -1;
        }
        Node current = head;
        for(int i = 0; i<index; i++){
             current = current.next;
        }
        return current.val;
    }
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }




    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

public void addAtIndex(int index,int value) {
    if (index < 0 || size < index) {
        return;
    }
    if (index == 0) {
        addAtHead(value);
    } else {
        Node newNode = new Node(value);
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }
}
public void deleteAtIndex(int index){
        if(index<0||index>=size){
            return;
        }
        if(index == 0) {
            head = head.next;
        }
        else{
            Node current = head;
            for(int i = 0; i<index-1;i++){
                current = current.next;
            }
            current.next =current.next.next;
        }
        size--;
}

    public static void main(String[] args) {
        FirstList firstList = new FirstList();
        firstList.addAtHead(20);
        firstList.addAtHead(30);
        firstList.addAtIndex(1,5);
        for(int i = 0; i<firstList.size;i++){
            System.out.println(firstList.get(i));
        }

    }









}
