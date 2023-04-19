import java.util.Scanner;

public class p1453 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[101];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (arr[a] == 0) {
                arr[a]++;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}