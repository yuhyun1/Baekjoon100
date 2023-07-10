import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[10];
        Arrays.fill(arr, 0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' == 9) arr[6]++;
            else {
                arr[s.charAt(i) - '0']++;
            }
        }
        int a = 0;
        if (arr[6] % 2 == 1) a = (arr[6] / 2) + 1;
        else a = arr[6] / 2;
        arr[6] = a;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }
}
