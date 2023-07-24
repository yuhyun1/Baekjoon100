import java.util.Scanner;

public class p11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[100005];
        int[] sum = new int[100005];
        for (int i = 1 ; i <= n; i++) {
            arr[i] = sc.nextInt();
            sum[i] = sum[i - 1] + arr[i];
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(sum[b] - sum[a - 1]);
        }
        sc.close();
    }
}
