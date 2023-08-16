import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2231Better {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int result = 0;

        for (int i = (n - (s.length() * 9)); i < n; i++) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum + i == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
