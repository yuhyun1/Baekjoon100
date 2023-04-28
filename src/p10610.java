import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        Arrays.sort(arr);
        if (arr[0] != '0') {
            System.out.println(-1);
        } else {
            int n = 0;
            for (int i = 1; i < arr.length; i++) {
                n += arr[i] - '0';
            }
            if (n % 3 != 0) {
                System.out.println(-1);
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i = arr.length - 1; i >= 0; i--) {
                    sb.append(arr[i]);
                }
                System.out.println(sb);
            }
        }
    }
}
