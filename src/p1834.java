import java.util.Scanner;

public class p1834 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (long i = 1; i < n; i++) {
            sum += (n + 1) * i;
        }
        System.out.println(sum);
    }
}