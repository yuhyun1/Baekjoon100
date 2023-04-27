import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                if(s.charAt(i) > 90) {
                    if (s.charAt(i) + 13 > 122) {
                        sb.append((char) (s.charAt(i) - 13));
                    } else {
                        sb.append((char) (s.charAt(i) + 13));
                    }
                } else {
                    if (s.charAt(i) + 13 > 90) {
                        sb.append((char) (s.charAt(i) - 13));
                    } else {
                        sb.append((char) (s.charAt(i) + 13));
                    }
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
