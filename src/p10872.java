import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 0 || n == 1) {
            System.out.print(1);
            System.exit(0);
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        System.out.print(result);
    }
}
