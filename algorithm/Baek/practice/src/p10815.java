import java.util.Arrays;
import java.util.Scanner;

public class p10815 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int M = sc.nextInt();
        int[] b = new int[M];
        for (int i = 0; i < M; i++) {
            b[i] = sc.nextInt();
        }

        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기

//실험할 코드 추가

        for (int i = 0; i < M; i++) {
            if (Arrays.binarySearch(a, b[i]) >= 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
        System.out.println("시간차이(m) : "+secDiffTime);

    }
}
