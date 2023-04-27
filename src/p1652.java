import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i].charAt(j) == '.') {
                    if (j + 1 < n && arr[i].charAt(j + 1) == '.') {
                        if (j + 2 >= n || (j + 2 < n && arr[i].charAt(j + 2) == 'X')) {
                            x++;
                        }
                    }
                    if (i + 1 < n && arr[i + 1].charAt(j) == '.') {
                        if (i + 2 >= n || (i + 2 < n && arr[i + 2].charAt(j) == 'X')) {
                            y++;
                        }
                    }
                }
            }
        }
        System.out.println(x + " " + y);
    }
}
