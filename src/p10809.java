import java.util.Scanner;

public class p10809 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        String s = sc.next();
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 97] == -1) {
                arr[s.charAt(i) - 97] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}