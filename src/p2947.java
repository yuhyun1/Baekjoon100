import java.util.Scanner;

public class p2947 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[j] > arr[j + 1]) {
                    int n = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = n;
                    for (int a : arr) {
                        System.out.print(a + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
