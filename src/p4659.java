import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p4659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s.equals("end")) break;

            String rpl = s.replaceAll("a|e|i|o|u", "");
            if (s.length() == rpl.length()) {
                System.out.println("<" + s + "> is not acceptable.");
                continue;
            }

            char[] arr = s.toCharArray();
            boolean tf = true;

            int vowel = 0;
            int consonant = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                    vowel++;
                    consonant = 0;
                } else {
                    consonant++;
                    vowel = 0;
                }
                if (vowel >= 3 || consonant >= 3) {
                    System.out.println("<" + s + "> is not acceptable.");
                    tf = false;
                    break;
                }
            }

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == arr[i - 1] && arr[i] != 'e' && arr[i] != 'o') {
                    System.out.println("<" + s + "> is not acceptable.");
                    tf = false;
                    break;
                }
            }

            if (tf) System.out.println("<" + s + "> is acceptable.");
        }
    }
}
