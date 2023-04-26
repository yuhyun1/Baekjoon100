import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        for (int i = 0; i < n; i++) {
            String s = new StringBuilder(arr[i]).reverse().toString();
            for (int j = i; j < n; j++) {
                if(s.equals(arr[j])) {
                    System.out.println(s.length() + " " + s.charAt(s.length() / 2));
                    break;
                }
            }
        }
    }
}
