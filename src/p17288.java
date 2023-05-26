import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p17288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] arr = s.toCharArray();
        int count = 0;
        int i = 0;
        while (i + 3 <= arr.length) {
            if ((arr[i] - '0') + 1 == (arr[i + 1] - '0') && (arr[i] - '0') + 2 == (arr[i + 2] - '0')) {
                if (i + 3 == arr.length) {
                    count++;
                    i += 2;
                } else if ((arr[i] - '0') + 3 == (arr[i + 3] - '0')) {
                    i += 3;
                } else {
                    count++;
                    i += 2;
                }
            }
            i++;
        }
        System.out.println(count);
    }
}
