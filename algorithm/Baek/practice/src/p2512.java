import java.util.Scanner;

public class p2512 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];

        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }
        int M = sc.nextInt();

        int sum=0;
        for(int i=0; i<N; i++){
            sum += a[i];
        }

        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(max < a[i]){
                max = a[i];
            }
        }

        int answer=0;
        if(sum > M){

        }
        else{
            answer = max;

        }
    }
}
