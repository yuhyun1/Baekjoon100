import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class p5568 {
    static int n;
    static int k;
    static int[] arr, v;
    static boolean[] visit;
    static HashSet<Integer> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        arr = new int[n];
        v = new int[k];
        visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dfs(0);
        System.out.println(set.size());
    }

    public static void dfs(int depth) {
        if (depth == k) {
            StringBuilder sum = new StringBuilder();
            for (int j : v) {
                sum.append(j);
            }
            set.add(Integer.parseInt(sum.toString()));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                v[depth] = arr[i];
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }
}
