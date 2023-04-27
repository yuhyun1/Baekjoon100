import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p9946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = 0;
        while(true) {
            c++;
            String a = br.readLine();
            String b = br.readLine();
            char[] arr = a.toCharArray();
            char[] brr = b.toCharArray();
            Arrays.sort(arr);
            Arrays.sort(brr);
            if (a.equals("END") && b.equals("END")) {
                break;
            } else if (a.length() != b.length()) {
                System.out.println("Case " + c + ": different");
            } else {
                for (int i = 0; i < a.length(); i++) {
                    if (arr[i] != brr[i]) {
                        System.out.println("Case " + c + ": different");
                        break;
                    } else if (i + 1 == a.length()) {
                        System.out.println("Case " + c + ": same");
                    }
                }
            }
        }
    }
}
