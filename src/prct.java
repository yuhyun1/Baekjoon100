import java.util.Scanner;

public class prct {
    public static void main(String[] args) {
        // 배열생성
        String[] names = new String[3]; // 배열의 길이 설정
        int[] numbers = new int[3];

        // 배열의 길이
        int size = names.length;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            // 문자열 입력
            System.out.println("이름을 입력하세요");
            names[i] = sc.next();

            // 숫자형 입력
            System.out.println("숫자를 입력하세요");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println(i + "번째 이름:" + names[i] + ", 숫자:" + numbers[i]);
        }
    }
}