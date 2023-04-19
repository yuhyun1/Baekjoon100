import java.math.BigInteger;
import java.util.Scanner;

public class p11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        BigInteger b = sc.nextBigInteger();
        BigInteger res = new BigInteger("0");
        for (int i = 1; i <= a; i++) {
            res = res.add(b.mod(BigInteger.TEN));
            b = b.divide(BigInteger.TEN);
        }
        System.out.println(res);
    }
}