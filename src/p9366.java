import java.util.Arrays;
import java.util.Scanner;

public class p9366 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[3];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 3; j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            if (arr[0] == arr[1] && arr[1] == arr[2]){
                System.out.println("Case #" + (i + 1) + ": equilateral");
            } else if (arr[2] >= (arr[0] + arr[1])){
                System.out.println("Case #" + (i + 1) + ": invalid!");
            } else if (arr[0] == arr[1] || arr[1] == arr[2]) {
                System.out.println("Case #" + (i + 1) + ": isosceles");
            } else {
                System.out.println("Case #" + (i + 1) + ": scalene");
            }
        }
    }
}