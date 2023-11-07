import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1915 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 전체 게임판의 크기가 1 x 1인 경우는
        // 바로 1 출력하고 끝냄.
        if (n == 1 && m == 1) {
            sb.append("1\n");
            System.out.print(sb.toString());
            br.close();
            return;
        }

        int ans = 0;

        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            String[] input = br.readLine().split("");

            for (int j = 1; j <= m; j++) {
                int temp = Integer.parseInt(input[j - 1]);

                if (i == 1 && j == 1) { // 맨 처음 게임판의 숫자는 그대로 dp[i][j]에 저장.
                    dp[i][j] = temp;
                } else { // (1, 2) 부터는 왼쪽, 위쪽, 왼쪽 대각선 방향 중 가장 작은 값에 1을 더한 값을 dp[i][j]에 저장.
                    if (temp == 1) {
                        dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                        ans = Math.max(ans, dp[i][j]);
                    }
                }
            }
        }

        sb.append(ans * ans).append("\n");
        System.out.print(sb.toString());
        br.close();
    }
}
