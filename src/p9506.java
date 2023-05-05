import java.util.Scanner;

public class p9506 {
    public static int countDivisors(int n) {
        int count = 0;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;
            int[] arr = new int[countDivisors(n) - 1];
            int j = 0;
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    if (j == 0 || arr[j - 1] != i) {
                        arr[j] = i;
                        j++;
                        sum += i;
                    }
                }
            }
            if (sum == n) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < arr.length; i++) {
                    if (i + 1 != arr.length) {
                        sb.append(arr[i]).append(" + ");
                    } else {
                        sb.append(arr[i]);
                    }
                }
                System.out.println(n + " = " + sb);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}
