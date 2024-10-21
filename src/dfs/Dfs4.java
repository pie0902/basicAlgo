package dfs;

//섬 구하기
public class Dfs4 {
    public static void cnt(int[][] ary, boolean[][] v, int x, int y) {
        // 현재 위치 방문 처리
        v[x][y] = true;

        // 상, 하, 좌, 우 방향
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // 상하좌우 탐색
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            // 배열 범위 내에 있고, 방문하지 않았으며, 육지인 경우
            if (newX >= 0 && newX < ary.length && newY >= 0 && newY < ary[0].length && !v[newX][newY] && ary[newX][newY] == 1) {
                cnt(ary, v, newX, newY);
            }
        }
    }
    public static void main(String[] args) {
        int[][] ary = {{1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 1, 1}
        };
        int rows = ary.length;
        int cols = ary[0].length;
        boolean[][] v = new boolean[rows][cols];  // 방문 여부를 기록하는 배열
        int islandCount = 0;  // 섬 개수 카운트
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // 새로운 섬을 발견하면 DFS 호출
                if (ary[i][j] == 1 && !v[i][j]) {
                    cnt(ary, v, i, j);  // DFS 함수 호출
                    islandCount++;  // 섬 개수 증가
                }
            }
        }
        System.out.println(islandCount);
    }
}
