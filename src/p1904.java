import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p1904 {
    public static int[] dp = new int[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Arrays.fill(dp,-1);

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        System.out.println(Tile(n));
    }

    public static int Tile(int n) {

        if(dp[n] == -1) {
            dp[n] = (Tile(n - 1) + Tile((n - 2))) % 15746;
        }
        return dp[n];
    }
}
