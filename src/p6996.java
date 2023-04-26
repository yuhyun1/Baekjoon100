import java.util.Arrays;
import java.util.Scanner;

public class p6996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();
            if (a.length() != b.length()) {
                System.out.println(a + " & " + b + " are NOT anagrams.");
            } else {
                char[] arr = a.toCharArray();
                char[] brr = b.toCharArray();
                Arrays.sort(arr);
                Arrays.sort(brr);
                boolean isAnagram = true;
                for (int j = 0; j < a.length(); j++) {
                    if (arr[j] != brr[j]) {
                        isAnagram = false;
                        break;
                    }
                }
                if (isAnagram) {
                    System.out.println(a + " & " + b + " are anagrams.");
                } else {
                    System.out.println(a + " & " + b + " are NOT anagrams.");
                }
            }
        }
    }
}

