import java.util.Scanner;
import java.util.Stack;

public class p10828 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("push")) {
                int k = sc.nextInt();
                st.push(k);
            }
            if (s.equals("top")) {
                if (st.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(st.peek()).append("\n");
                }
            } else if (s.equals("empty")) {
                if (st.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (s.equals("size")) {
                sb.append(st.size()).append("\n");
            } else if (s.equals("pop")) {
                if (st.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(st.pop()).append("\n");
                }
            }
        }
        System.out.print(sb.toString());
    }
}