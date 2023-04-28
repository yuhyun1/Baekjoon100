import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] arr = s.toCharArray();
        StringBuilder sb;
        String[] answer = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                sb.append(arr[j]);
            }
            answer[i] = sb.toString();
        }
        Arrays.sort(answer);
        for (String a : answer) {
            System.out.println(a);
        }
    }
}
