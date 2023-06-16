import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p5800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < k; i++) {
            String[] spl = br.readLine().split(" ");
            int n = Integer.parseInt(spl[0]);
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(spl[j + 1]);
            }
            Arrays.sort(arr);
            int gap = 0;
            for (int l = 0; l < arr.length; l++) {
                if (l + 1 != arr.length && gap < arr[l + 1] - arr[l]) {
                    gap = arr[l + 1] - arr[l];
                }
            }
            System.out.println("Class " + (i + 1) / 1);
            System.out.println("Max " + arr[n - 1] + ", Min " + arr[0] + ", Largest gap " + gap);
        }
    }
}
