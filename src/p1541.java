import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split("-");
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            String[] p = arr[i].split("\\+");
            int sum = 0;
            for (int j = 0; j < p.length; j++) {
                sum += Integer.parseInt(p[j]);
            }
            if (i == 0) {
                n += sum;
            } else {
                n -= sum;
            }
        }
        System.out.println(n);
    }
}
