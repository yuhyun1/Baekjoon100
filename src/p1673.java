import java.util.Scanner;

public class p1673 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int cnt = n; // 쿠폰을 사용하지 않고 먹을 수 있는 치킨 수
            int stamp = n; // 현재 가지고 있는 쿠폰의 수

            while(stamp >= k) { // 쿠폰으로 치킨을 먹을 수 있는 경우
                int newChick = stamp / k; // 새로운 치킨 수 계산
                cnt += newChick; // 새로운 치킨 수 더하기
                stamp = stamp % k + newChick; // 쿠폰 수 갱신
            }

            System.out.println(cnt); // 결과 출력
        }

        sc.close();
    }
}
