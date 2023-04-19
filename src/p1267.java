import java.util.Scanner;

public class p1267 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = 0;
        int m = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            y += ((a / 30) + 1) * 10;
            m += ((a / 60) + 1) * 15;
        }
        int result = Math.min(y , m);
        if (y == m) {
            System.out.println("Y M " + y);
        } else if (result == y) {
            System.out.println("Y " + y);
        } else if (result == m) {
            System.out.println("M " + m);
        }
    }
}