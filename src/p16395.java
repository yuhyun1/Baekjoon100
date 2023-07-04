import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p16395 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] spl = br.readLine().split(" ");
        int n = Integer.parseInt(spl[0]);
        int k = Integer.parseInt(spl[1]);

        int[][] dp = new int[n + 1][n + 1];
        dp[1][1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        System.out.print(dp[n][k]);
    }
}
