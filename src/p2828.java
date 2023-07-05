import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] spl = br.readLine().split(" ");
        int n = Integer.parseInt(spl[0]);
        int m = Integer.parseInt(spl[1]);
        int j = Integer.parseInt(br.readLine());
        int answer = 0;
        int start = 1, end = m;
        for (int i = 0; i < j; i++) {
            int apple = Integer.parseInt(br.readLine());
            if (start > apple) {
                answer += start - apple;
                end -= start - apple;
                start = apple;
            } else if (end < apple) {
                answer += apple - end;
                start += apple - end;
                end = apple;
            }
        }
        System.out.println(answer);
    }
}
