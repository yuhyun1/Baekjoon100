import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.print(factorial(n));
    }

    public static long factorial(int n) {
        if (n <= 1) return 1;

        return n * factorial(n - 1);
    }
}
