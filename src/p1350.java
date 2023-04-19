import java.math.BigInteger;
import java.util.Scanner;

public class p1350 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger count = new BigInteger("0");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int c = sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] <= c && arr[j] != 0){
                count = count.add(BigInteger.valueOf(c));
            }else if (arr[j] > c) {
                if (arr[j] % c != 0) {
                    int h = (arr[j] / c) + 1;
                    count = count.add(BigInteger.valueOf(c * h));
                }else if (arr[j] % c == 0) {
                    int a = (arr[j] / c);
                    count = count.add(BigInteger.valueOf(c * a));
                }
            }
        }
        System.out.println(count);
    }

}