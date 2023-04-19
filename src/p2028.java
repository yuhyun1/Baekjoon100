import java.util.Scanner;

public class p2028 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt();
            int nn = n * n;
            if (n < 10) {
                if (nn % 10 == n) {
                    System.out.println("YES");
                } else System.out.println("NO");
            } else if (n < 100) {
                if (nn % 100 == n) {
                    System.out.println("YES");
                } else System.out.println("NO");
            } else if (n < 1000) {
                if (nn % 1000 == n) {
                    System.out.println("YES");
                } else System.out.println("NO");
            } else System.out.println("NO");
        }
    }
}