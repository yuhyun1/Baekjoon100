import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double total = 0;
        double h = 0;
        for (int i = 0; i < 20; i++) {
            String[] spl = br.readLine().split(" ");
            if (!spl[2].equals("P")) {
                h += Double.parseDouble(spl[1]);
            }
            if (spl[2].equals("A+")) total += Double.parseDouble(spl[1]) * 4.5;
            else if (spl[2].equals("A0")) total += Double.parseDouble(spl[1]) * 4.0;
            else if (spl[2].equals("B+")) total += Double.parseDouble(spl[1]) * 3.5;
            else if (spl[2].equals("B0")) total += Double.parseDouble(spl[1]) * 3.0;
            else if (spl[2].equals("C+")) total += Double.parseDouble(spl[1]) * 2.5;
            else if (spl[2].equals("C0")) total += Double.parseDouble(spl[1]) * 2.0;
            else if (spl[2].equals("D+")) total += Double.parseDouble(spl[1]) * 1.5;
            else if (spl[2].equals("D0")) total += Double.parseDouble(spl[1]);
        }
        System.out.println(total / h);
    }
}
