import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] t = new int[n + 1];
        int[] p = new int[n + 1];
        int[] dp = new int[n + 2];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = n; i > 0; i--) {
            int day = i + t[i]; // 다음 날짜

            if (day > n + 1) { // 일할 수 있는 날짜를 넘어가는 경우
                // 일을 하지 못하므로 바로 다음 DP값(더 앞쪽의 날짜)로 설정
                dp[i] = dp[i + 1];
            } else { // 일할 수 있는 날짜인 경우
                // 1. 일하지 않았을 때(dp[i + 1])
                // 2. 일 했을 때 총 벌 수 있는 금액(p[i] + dp[next])
                // 위 두 경우 중 더 큰 값을 dp에 넣어준다.
                dp[i] = Math.max(dp[i + 1], p[i] + dp[day]);
            }
        }
        System.out.println(dp[1]);
    }
}
