import java.util.Scanner;

public class p2231 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stn = sc.nextLine();
        int nl = stn.length();
        int n = Integer.parseInt(stn);
        int result = 0;

        for (int i = (n - (nl * 9)); i < n; i++) {
            int number = i;
            int sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum + i == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}