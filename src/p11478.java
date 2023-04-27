import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class p11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Set<String> set = new HashSet<>();
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            a = "";
            for (int j = i; j < s.length(); j++) {
                a += s.substring(j, j + 1);
                set.add(a);
            }
        }
        System.out.println(set.size());
    }
}
