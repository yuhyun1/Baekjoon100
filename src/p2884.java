import java.util.Scanner;

public class p2884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        if (h == 0) {
            h = 24;
        }
        int res = ((h * 60) + m) - 45;
        int hh = res / 60;
        int mm = res % 60;
        if (hh == 24) {
            hh = 0;
        }
        System.out.print(hh + " " + mm);
    }
}