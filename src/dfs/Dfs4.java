package dfs;

//섬 구하기
public class Dfs4 {

    public static void dfs(int[][] ary, boolean[][] v, int x, int y) {
        int[] newX = {0, 0, -1, 1};
        int[] newY = {-1, 1, 0, 0};
        v[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + newX[i];
            int ny = y + newY[i];

            // 먼저 인덱스 범위 체크 후에 탐색
            if (ny >= 0 && ny < ary.length && nx >= 0 && nx < ary[0].length && ary[ny][nx] == 1
                && !v[ny][nx]) {
                dfs(ary, v, nx, ny);
            }
        }
    }

    public static void main(String[] args) {
        int[][] ary = {{1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 1, 1}
        };
        boolean[][] v = new boolean[ary.length][ary[0].length];
        int cnt = 0;
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[0].length; j++) {
                if (ary[i][j] == 1 && !v[i][j]) {
                    dfs(ary, v, i, j);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}