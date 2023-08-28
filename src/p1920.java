import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1920 {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (binarySearch(num) >= 0) System.out.println(1);
            else System.out.println(0);

        }

    }

    static int binarySearch(int num) {

        int lo = 0;
        int hi = arr.length - 1;
        int mid;

        while (lo <= hi) {

            mid = (lo + hi) / 2;

            if (num < arr[mid]) {
                hi = mid - 1;
            } else if (num > arr[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
