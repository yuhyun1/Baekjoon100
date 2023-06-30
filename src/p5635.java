import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        String[] yng = arr[0].split(" ");
        String[] old = arr[0].split(" ");
        for (int i = 1; i < n; i++) {
            String[] s = arr[i].split(" ");

            if (Integer.parseInt(yng[3]) < Integer.parseInt(s[3])) {
                yng = arr[i].split(" ");
            } else if (Integer.parseInt(yng[3]) == Integer.parseInt(s[3])) {
                if (Integer.parseInt(yng[2]) < Integer.parseInt(s[2])) {
                    yng = arr[i].split(" ");
                } else if (Integer.parseInt(yng[2]) == Integer.parseInt(s[2])) {
                    if (Integer.parseInt(yng[1]) < Integer.parseInt(s[1])) {
                        yng = arr[i].split(" ");
                    }
                }
            }
            if (Integer.parseInt(old[3]) > Integer.parseInt(s[3])) {
                old = arr[i].split(" ");
            } else if (Integer.parseInt(old[3]) == Integer.parseInt(s[3])) {
                if (Integer.parseInt(old[2]) > Integer.parseInt(s[2])) {
                    old = arr[i].split(" ");
                } else if (Integer.parseInt(old[2]) == Integer.parseInt(s[2])) {
                    if (Integer.parseInt(old[1]) > Integer.parseInt(s[1])) {
                        old = arr[i].split(" ");
                    }
                }
            }
        }
        System.out.println(yng[0]);
        System.out.println(old[0]);
    }
}
