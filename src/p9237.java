import java.util.Arrays;
import java.util.Scanner;

public class p9237 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int cnt = 1;
        int max = 0;
        for (int i = n - 1; i >= 0; i--) {
            cnt++;
            if (cnt + arr[i] > max) max = arr[i] + cnt;
        }
        System.out.println(max);
    }
}
