import java.util.Scanner;

public class p1356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        boolean result = false;
        int a = 1;
        int b = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i) - '0';
        }
        for (int i = 0; i < arr.length; i++) {
            a *= arr[i];
            b = 1;
            for (int j = i + 1; j < arr.length; j++) {
                b *= arr[j];
            }
            if (a == b && s.length() != 1) {
                result = true;
            }
        }
        if (result) System.out.println("YES");
        else System.out.println("NO");
    }
}
