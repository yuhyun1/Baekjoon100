import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p8595 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        BigInteger sum = BigInteger.valueOf(0);
        int a = 0;
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(arr[i])) {
                a = a * 10 + arr[i] - '0';
            } else {
                sum = sum.add(BigInteger.valueOf(a));
                a = 0;
            }
        }
        sum = sum.add(BigInteger.valueOf(a));
        System.out.println(sum);
    }
}
