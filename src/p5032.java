import java.util.Scanner;

public class p5032 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int f = sc.nextInt();
        int c = sc.nextInt();
        int ef = e + f;
        int count = 0;
        while (true) {
            if (ef < c) {
                break;
            }
            count += ef / c;
            ef = (ef / c) + (ef % c);
        }
        System.out.println(count);
    }
}