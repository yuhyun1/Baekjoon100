import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p21921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int end = 0;
        int sum = 0;
        int max = 0;
        int count = 1;

        for (int i = 0; i < n; i++) {
            while ((end - i < x) && end < n){
                sum += arr[end++];
            }
            if (max == sum){
                count++;
            } else if (max < sum){
                max = sum;
                count = 1;
            }

            sum -= arr[i];
        }

        if (max == 0) {
            System.out.println("SAD");
            return;
        }

        System.out.println(max);
        System.out.println(count);
    }
}
