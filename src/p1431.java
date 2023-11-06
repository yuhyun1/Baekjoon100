import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p1431 {
    static String[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        sort();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);
    }

    public static void sort() {

        Arrays.sort(arr, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                int sum1 = 0;
                int sum2 = 0;
                for (int i = 0; i < o1.length(); i++) {
                    if (o1.charAt(i) <= '9' && o1.charAt(i) >= '0') {
                        sum1 += Integer.parseInt(String.valueOf(o1.charAt(i)));
                    }
                }
                for (int i = 0; i < o2.length(); i++) {
                    if (o2.charAt(i) <= '9' && o2.charAt(i) >= '0') {
                        sum2 += Integer.parseInt(String.valueOf(o2.charAt(i)));
                    }
                }
                if (sum1 == sum2) return o1.compareTo(o2);
                else return sum1 - sum2;

            } else {
                return o1.length() - o2.length();
            }
        });
    }
}
