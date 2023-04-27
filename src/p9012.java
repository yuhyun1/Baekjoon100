import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            while(true) {
                String a = s.replaceAll("\\(\\)","");
                if (a.equals(s)) break;
                s = a;
            }
            if (s.length() > 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
