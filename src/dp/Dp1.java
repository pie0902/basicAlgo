package dp;
//계단오르기
public class Dp1 {
    public static void main(String[] args) {
        int n = 7;
        int[] dp = new int[7+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i<=n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[n]);
    }
}
