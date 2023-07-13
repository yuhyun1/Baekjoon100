import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class p10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int l = 0;
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");

            if (s[0].equals("push")) {
                l = Integer.parseInt(s[1]);
                q.add(l);
            } else if (s[0].equals("pop")) {
                if (q.isEmpty()) sb.append(-1).append("\n");
                else sb.append(q.poll()).append("\n");
            } else if (s[0].equals("size")) {
                sb.append(q.size()).append("\n");
            } else if (s[0].equals("empty")) {
                if (q.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else if (s[0].equals("front")) {
                if (q.isEmpty()) sb.append(-1).append("\n");
                else sb.append(q.peek()).append("\n");
            } else if (s[0].equals("back")) {
                if (q.isEmpty()) sb.append(-1).append("\n");
                else sb.append(l).append("\n");
            }
        }
        System.out.println(sb);
    }
}
