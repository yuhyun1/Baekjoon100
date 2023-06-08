import java.util.Scanner;

public class p10823 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[1500];
        int sum = 0;
        int n = 0;
        for (int i = 0; i < 50; i++) {
            for (int j = 1; j <= i + 1; j++) {
                arr[n] = i + 1;
                n++;
            }
        }
        for (int i = a - 1; i <= b - 1; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
