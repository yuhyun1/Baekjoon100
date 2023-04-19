import java.math.BigInteger;
import java.util.Scanner;

public class p1247 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            BigInteger s = BigInteger.ZERO;
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                BigInteger a = sc.nextBigInteger();
                s = s.add(a);
            }
            if (s.compareTo(BigInteger.ZERO) == 0) {
                System.out.println("0");
            } else if (s.compareTo(BigInteger.ZERO) > 0) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }
    }
}