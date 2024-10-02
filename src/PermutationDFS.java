import java.util.*;

public class PermutationDFS {
    static int cnt = 0;  // 순열의 개수를 셀 변수

    public static void solution(int[] ary, boolean[] visited, List<Integer> list) {
        // 현재 순열의 길이가 배열의 길이와 같으면 순열을 출력
        if (list.size() == ary.length) {
            System.out.println("완성된 순열: " + list);  // 완성된 순열 출력
            cnt++;  // 순열의 개수를 증가
            return;
        }

        // 배열의 각 숫자를 순서대로 시도
        for (int i = 0; i < ary.length; i++) {
            if (!visited[i]) {
                visited[i] = true;  // 현재 숫자 방문 처리
                list.add(ary[i]);  // 숫자를 현재 순열에 추가
                System.out.println("추가: " + ary[i] + ", 현재 리스트: " + list);  // 숫자 추가 상태 출력
                System.out.println("현재 방문 상태: " + Arrays.toString(visited));  // 방문 상태 출력

                // 재귀 호출로 다음 숫자를 탐색
                solution(ary, visited, list);

                // 백트래킹: 숫자를 제거하고 다시 돌아옴
                visited[i] = false;  // 방문 여부를 원상태로 되돌림
                list.remove(list.size() - 1);  // 마지막에 추가한 숫자를 제거
                System.out.println("제거: " + ary[i] + ", 현재 리스트: " + list);  // 숫자 제거 상태 출력
                System.out.println("현재 방문 상태: " + Arrays.toString(visited));  // 방문 상태 출력
            }
        }
    }

    public static void main(String[] args) {
        int[] ary = {1, 2, 3};  // 탐색할 배열
        boolean[] visited = new boolean[ary.length];  // 방문 여부를 기록할 배열
        List<Integer> list = new ArrayList<>();  // 현재 순열을 저장할 리스트

        System.out.println("DFS로 순열 생성 시작...");
        solution(ary, visited, list);  // DFS 호출

        // 모든 순열을 다 출력한 후, 순열의 개수 출력
        System.out.println("총 순열의 개수: " + cnt);
    }
}
