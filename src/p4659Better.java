import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p4659Better {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "", result = "";
        String regex = "^[^aeiou]+$|[aeiou]{3,}|[^aeiou]{3,}|([^eo])\\1+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        while (!(str = br.readLine()).equals("end")) {
            matcher = pattern.matcher(str);
            result = matcher.find()?"not acceptable.":"acceptable.";
            sb.append("<").append(str).append("> is ").append(result).append("\n");
        }
        System.out.println(sb);
    }
}
