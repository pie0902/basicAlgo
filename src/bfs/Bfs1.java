
package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs1 {

    public static void bfs(LinkedList<Integer>[] nodes, boolean[] v, int n) {
        Queue<Integer> temp = new LinkedList<>();  // Queue는 Integer로
        temp.offer(1);  // 시작 노드는 1번
        v[1] = true;  // 1번 노드를 방문했다고 표시

        while (!temp.isEmpty()) {
            int now = temp.poll();  // 큐에서 현재 노드를 꺼냄
            System.out.println(now);  // 현재 노드를 출력

            // 현재 노드와 연결된 노드들을 확인
            for (int i : nodes[now]) {
                if (!v[i]) {  // 방문하지 않은 노드만 큐에 추가
                    v[i] = true;  // 방문 처리
                    temp.offer(i);  // 큐에 넣음
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 7;
        LinkedList<Integer>[] nodes = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new LinkedList<>();
        }
        nodes[1].add(2); nodes[1].add(3);
        nodes[2].add(4);
        nodes[3].add(5); nodes[3].add(6);
        boolean[] v = new boolean[n];
        bfs(nodes, v, n);
    }
}
