import java.util.Scanner;

public class p2506 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] == 1) {
                count++;
                sum += count;
            }else {
                count = 0;
            }
        }
        System.out.println(sum);

    }

}