package basic.singleNode;


import java.util.List;

//문제 1: 중간 노드 삭제하기
//문제 설명:
//단일 연결 리스트가 주어졌을 때, 중간에 위치한 노드 하나를 삭제하는 함수를 작성하세요. 주어지는 노드는 리스트의 끝이 아닙니다.
// 예를 들어, head가 다음과 같은 리스트를 가리키고 있다고 가정합시다:
public class Practice1 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
//제한사항:
//리스트의 크기는 최소 3 이상입니다.
//삭제할 노드는 항상 리스트의 중간에 위치합니다.
//삭제할 노드는 head 노드나 tail 노드가 아닙니다.

    public static void removeNode(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null&&fast.next!=null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev!=null){
            prev.next = slow.next;
        }
    }
    public static ListNode reverseNode(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode newTemp;
        while (curr != null) {
            newTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newTemp;
        }
        return prev;
    }
    public static int getSize(ListNode head){
        int size = 1;
        ListNode curr = head;
        while(curr!=null&&curr.next!=null) {
            size++;
            curr = curr.next;
        }
        return size;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(10); // 첫 번째 노드 생성
        head.next = new ListNode(20);     // 두 번째 노드 연결
        head.next.next = new ListNode(30); // 세 번째 노드 연결
        head.next.next.next = new ListNode(40); // 네 번째 노드 연결
        head.next.next.next.next = new ListNode(50); // 다섯 번째 노드 연결
        head.next.next.next.next.next = new ListNode(60);
        //ListNode newNode = reverseNode(head);
        ListNode current = head;
        int idx = getSize(head);
        int cnt = 0;
        System.out.println(idx);
        int n = 4;
        while (current != null) {
            if(cnt== (idx-n)){
                System.out.println("정답: " + current.val + " ");

                break;
            }
            System.out.print(current.val + " ");
            current = current.next;
            cnt++;
        }
    }
}
