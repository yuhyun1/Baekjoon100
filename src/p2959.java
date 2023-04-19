import java.util.Arrays;
import java.util.Scanner;

public class p2959 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int a = Math.min(arr[2],arr[3]);
        int b = Math.min(arr[0],arr[1]);

        System.out.println(a * b);
    }
}