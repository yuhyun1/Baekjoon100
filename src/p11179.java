import java.util.Scanner;

public class p11179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toUnsignedString(n, 2);
        String sr = new StringBuilder(s).reverse().toString();
        System.out.println(Integer.parseInt(sr, 2));
    }
}
