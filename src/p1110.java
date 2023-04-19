import java.util.Scanner;

public class p1110 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int a = n;
        while (true) {
            a = ((a % 10) * 10) + (((a / 10) + (a % 10)) % 10);
            count++;
            if (n == a) {
                break;
            }
        }
        System.out.println(count);
    }
}