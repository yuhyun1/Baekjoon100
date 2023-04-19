import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1284 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int result = 2;
            String n = br.readLine();
            if (n.equals("0")) {
                break;
            }
            for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) == '1') {
                    result += 2;
                } else if (n.charAt(i) == '0') {
                    result += 4;
                } else {
                    result += 3;
                }
            }
            result += n.length() - 1;
            System.out.println(result);
        }
    }
}