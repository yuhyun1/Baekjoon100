import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 4 || n == 7) {
            System.out.println(-1);
        } else if (n % 5 == 0) {
            System.out.println(n / 5);
        } else if (n == 3 || n == 6 || n == 9 || n == 12) {
            System.out.println(n / 3);
        } else {
            int a = n / 5;
            for (int i = a; i >= 1; i--) {
                if ((n - (i * 5)) % 3 == 0) {
                    int thr = (n - (i * 5)) / 3;
                    System.out.println(i + thr);
                    break;
                }
            }
        }
    }
}
