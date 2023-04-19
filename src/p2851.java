import java.util.Scanner;

public class p2851 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a += arr[i];
            if (i == 9) {
                break;
            }
            if (Math.abs(100 - a) < Math.abs(100 - (a + arr[i + 1]))) {
                break;
            } else if (Math.abs(100 - a) == Math.abs(100 - (a + arr[i + 1]))) {
                a += arr[i + 1];
                break;
            }
        }
        System.out.println(a);
    }
}