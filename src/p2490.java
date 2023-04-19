import java.util.Scanner;

public class p2490 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < 3; j++) {
            int count = 0;
            for (int i = 0; i < 4; i++) {
                int a = sc.nextInt();
                count += a;
            }
            if (count == 0) {
                System.out.println("D");
            } else if (count == 1) {
                System.out.println("C");
            } else if (count == 2) {
                System.out.println("B");
            } else if (count == 3) {
                System.out.println("A");
            } else if (count == 4) {
                System.out.println("E");
            }
        }
    }
}