import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        String[] s;
        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int r = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    r++;
                }
            }
            sb.append(r).append(' ');
        }
        System.out.println(sb);
    }
}
