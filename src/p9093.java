import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            StringBuilder sb = new StringBuilder();
            String[] arr = s.split(" ");
            for (int j = 0; j < arr.length; j++) {
                String st = new StringBuilder(arr[j]).reverse().toString();
                sb.append(st).append(" ");
            }
            System.out.println(sb);
        }
    }
}
