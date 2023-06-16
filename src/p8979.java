import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[][] arr = new int[n][3];
        for(int i = 0; i < n; i++){
            nk = br.readLine().split(" ");
            int x = Integer.parseInt(nk[0]) - 1;
            for(int j = 0; j < 3; j++){
                arr[x][j] = Integer.parseInt(nk[j + 1]);
            }
        }
        int cnt = 1;
        for(int i = 0; i < n; i++){
            if (i == k - 1) {
                continue;
            } else if (arr[i][0] > arr[k-1][0]) {
                cnt++;
                continue;
            } else if (arr[i][0] == arr[k-1][0]) {
                if(arr[i][1] > arr[k-1][1]) {
                    cnt++;
                } else if (arr[i][1] == arr[k-1][1] && arr[i][2] > arr[k-1][2]) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
