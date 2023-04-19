import java.util.Scanner;

public class p1085 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int a = Math.min((w - x) , (h - y));
        int b = Math.min(x , y);
        System.out.println(Math.min(a , b));
    }
}