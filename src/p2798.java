import java.util.Scanner;

public class p2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int val = arr[i] + arr[j] + arr[k];
                    if (val <= m && val > max) {
                        max = val;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
