import java.util.Scanner;

public class p2476 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int money = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a == b && b == c) {
                money = 10000 + (a * 1000);
            } else if (a != b && b != c && a != c) {
                money = Math.max(a , Math.max(b , c)) * 100;
            } else {
                if (a == b || a == c) {
                    money = 1000 + (a * 100);
                } else {
                    money = 1000 + (b * 100);
                }
            }
            if (money > max) {
                max = money;
            }
        }
        System.out.println(max);
    }
}