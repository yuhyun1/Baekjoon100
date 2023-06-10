import java.util.Arrays;
import java.util.Scanner;

public class p14467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[11];
        Arrays.fill(arr, 2);
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (arr[a] == 2) {
                arr[a] = b;
            } else if (arr[a] != b) {
                sum++;
                arr[a] = b;
            }
        }
        System.out.println(sum);
    }
}
