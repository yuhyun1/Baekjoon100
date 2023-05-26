import java.util.Scanner;

public class p11170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int count = 0;
            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int j = n; j <= m; j++) {
                if (j == 0) {
                    count++;
                }
                int a = j;
                while (a > 9) {
                    if (a % 10 == 0) {
                        count++;
                    }
                    a /= 10;
                }
            }
            System.out.println(count);
        }
    }
}
