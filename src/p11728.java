import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] spl = br.readLine().split(" ");
        int n = Integer.parseInt(spl[0]);
        int m = Integer.parseInt(spl[1]);
        int[] arr = new int[n + m];

        String[] nrr = br.readLine().split(" ");
        String[] mrr = br.readLine().split(" ");
        int k = 0;
        for (int i = 0; i < n; i++) {
            arr[k++] = Integer.parseInt(nrr[i]);
        }
        for (int i = 0; i < m; i++) {
            arr[k++] = Integer.parseInt(mrr[i]);
        }
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
