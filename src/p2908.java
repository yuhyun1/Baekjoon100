import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t = br.readLine().split(" ");
        int a = (t[0].charAt(0) - '0') + (t[0].charAt(1) - '0') * 10 + (t[0].charAt(2) - '0') * 100;
        int b = (t[1].charAt(0) - '0') + (t[1].charAt(1) - '0') * 10 + (t[1].charAt(2) - '0') * 100;
        System.out.println(Math.max(a, b));
    }
}
