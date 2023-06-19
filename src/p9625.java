import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9625 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int a = 1;
        int b = 0;
        for (int i = 0; i < k; i++) {
            int y = b;
            b += a;
            a = y;
        }
        System.out.println(a + " " + b);
    }
}
