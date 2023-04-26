import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int smile = (s.length() - s.replace(":-)", "").length()) / 3;
        int sad = (s.length() - s.replace(":-(", "").length()) / 3;
        if (smile == 0 && sad == 0) {
            System.out.println("none");
        } else if (smile == sad) {
            System.out.println("unsure");
        } else if (smile > sad) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}
