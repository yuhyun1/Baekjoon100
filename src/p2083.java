import java.util.Scanner;

public class p2083 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String a = sc.next();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a.equals("#") && b == 0 && c == 0) {
                break;
            }
            if (b > 17 || c >= 80) {
                System.out.println(a + " Senior");
            } else {
                System.out.println(a + " Junior");
            }
        }
    }
}