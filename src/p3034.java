import java.util.Scanner;

public class p3034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        double d = Math.sqrt(w * w + h * h);
        for (int i = 0; i < n; i++){
            int a = sc.nextInt();
            if (a <= d){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }
    }
}