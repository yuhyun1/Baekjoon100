import java.util.Scanner;

public class p1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 100) {
            System.out.println(n);
        } else if (n < 111) {
            System.out.println(99);
        } else if (n == 1000) {
            System.out.println(144);
        }else {
            int sum = 99;
            for (int i = 111; i <= n; i++) {
                int a = i % 10;
                int b = (i / 10) % 10;
                int c = i / 100;
                if (a - b == b - c) {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
