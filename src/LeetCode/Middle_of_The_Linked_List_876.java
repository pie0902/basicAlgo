package LeetCode;

public class Middle_of_The_Linked_List_876 {

    // Definition for singly-linked list.
    static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {
        //head를 카피함
        ListNode copy = head;
        //현재의 node위치를 확인할 변수를 선언
        int len = 0;
        //copy의 마지막 null이 주소값이 될때까지 반복
        while (copy != null) {
            copy = copy.next;
            len++;
        }
        //구한 길이를 2로 나눔
        int middle = len / 2;
        //다시 처음으로 초기화
        copy = head;
        //헤드의 위치를 2로나눈 시작값으로 옮김
        for (int i = 0; i < middle; i++) {
            copy = copy.next;
        }
        return copy;
    }
}
