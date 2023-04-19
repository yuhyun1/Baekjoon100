import java.math.BigInteger;
import java.util.Scanner;

public class p2935 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        String p = sc.next();
        BigInteger b = sc.nextBigInteger();
        sc.close();
        if (p.equals("+")) {
            System.out.println(a.add(b));
        } else if (p.equals("*")) {
            System.out.println(a.multiply(b));
        }
    }
}