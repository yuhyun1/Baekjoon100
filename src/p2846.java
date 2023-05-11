import java.util.Scanner;

public class p2846 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int r = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr.length) {
                if (arr[i] < arr[i + 1]) {
                    max += arr[i + 1] - arr[i];
                } else {
                    if (r < max) {
                        r = max;
                    }
                    max = 0;
                }
            } else {
                if (r < max) {
                    System.out.println(max);
                } else {
                    System.out.println(r);
                }
            }
        }
    }
}
