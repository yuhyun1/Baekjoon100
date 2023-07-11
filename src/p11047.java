import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] spl = br.readLine().split(" ");
        int n = Integer.parseInt(spl[0]);
        int k = Integer.parseInt(spl[1]);
        int[] arr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        while (k > 0) {
            for (int i = 0; i < n; i++) {
                if (arr[i] <= k) {
                    k -= arr[i];
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
