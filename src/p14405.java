import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p14405 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().replaceAll("pi|ka|chu", "");
        if (s.length() == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
