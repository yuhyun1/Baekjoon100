import java.util.Scanner;

public class p11557 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = "";
            int max = 0;
            for (int j = 0; j < n; j++) {
                String name = sc.next();
                int l = sc.nextInt();
                if (l > max) {
                    s = name;
                    max = l;
                }
            }
            System.out.println(s);
        }
    }
}
