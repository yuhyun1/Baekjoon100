import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p2204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            String[] arr = new String[n];
            String[] brr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = br.readLine();
                brr[i] = arr[i].toLowerCase();
            }
            Arrays.sort(brr);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].toLowerCase().equals(brr[0])) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
