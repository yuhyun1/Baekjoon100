import java.util.Scanner;

public class p16171 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = "";
        String find = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) - '0' >= 0 && str.charAt(i) - '0' <= 9))
                s += str.charAt(i);
        }

        System.out.println(s.contains(find) ? 1 : 0);
    }
}
