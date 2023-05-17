import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        int i = 0;
        int count = 1;
        while (i < arr.length) {
            if (arr[i] == 'S') {
                count++;
                i++;
            } else {
                count++;
                i += 2;
            }
        }
        if (count > n) {
            System.out.println(n);
        } else {
            System.out.println(count);
        }
    }
}
