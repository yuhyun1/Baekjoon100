import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p13301 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 0) System.out.println(0);
        else if (n == 1) System.out.println(4);
        else if (n == 2) System.out.println(6);
        else {
            long[] arr = new long[n + 1];
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i < arr.length; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            long answer = (arr[n] * 2L) + (arr[n - 1] * 4L) + (arr[n - 2] * 2L);
            System.out.println(answer);
        }
    }
}
