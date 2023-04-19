import java.util.Scanner;

public class p2863 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        double[] results = new double[4];
        results[0] = (double) a / c + (double) b / d;
        results[1] = (double) c / d + (double) a / b;
        results[2] = (double) d / b + (double) c / a;
        results[3] = (double) b / a + (double) d / c;

        double max = 0.0;
        int idx = 0;

        for (int i = 0; i < 4; i++) {
            if (results[i] > max) {
                max = results[i];
                idx = i;
            }
        }

        System.out.println(idx);

        sc.close();
    }
}