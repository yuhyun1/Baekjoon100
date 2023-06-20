import java.util.Scanner;

public class p2628 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] xrr = new int[x + 1];
        int[] yrr = new int[y + 1];
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int xy = sc.nextInt();
            int n = sc.nextInt();
            if (xy == 0) yrr[n] = 1;
            else xrr[n] = 1;
        }
        int t = 0;
        int max1 = 0;
        for (int i = 1; i <= x; i++) {
            t++;
            if (xrr[i] == 1 || i == x) {
                max1 = Math.max(max1, t);
                t = 0;
            }
        }
        t = 0;
        int max2 = 0;
        for (int i = 1; i <= y; i++) {
            t++;
            if (yrr[i] == 1 || i == y) {
                max2 = Math.max(max2, t);
                t = 0;
            }
        }
        System.out.println(max1 * max2);
    }
}
