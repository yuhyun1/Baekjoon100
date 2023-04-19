import java.util.Scanner;

public class p2386 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String a = sc.nextLine();
            if (a.equals("#")) {
                break;
            }
            String[] strArr = a.toLowerCase().split("");

            int count = 0;
            for (int i = 0; i < strArr.length; i++) {
                if (a.split(" ")[0].equals(strArr[i]))
                    count++;
            }
            System.out.println(a.split(" ")[0] + " " + (count - 1));
        }
    }
}