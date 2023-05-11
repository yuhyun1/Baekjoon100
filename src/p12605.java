import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            String[] t = s.split(" ");
            StringBuilder sb = new StringBuilder();
            sb.append("Case #").append(i).append(": ");
            for (int j = t.length - 1; j >= 0; j--) {
                if (j != 0) {
                    sb.append(t[j]).append(" ");
                } else {
                    sb.append(t[j]);
                }
            }
            System.out.println(sb);
        }
    }
}
