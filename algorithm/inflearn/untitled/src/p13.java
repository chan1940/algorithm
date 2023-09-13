import java.io.*;
import java.util.Scanner;

public class p13 {
    public String solution(String str) {
        String answer = "";
        int m = 0;
        String[] s = str.split(" ");
        for (String x : s) {
            if (x.length() > m) {
                m = x.length();
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        p13 T = new p13();
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String str = br.readLine();
        //단어 하나가 아니라 문장을 받아야 하기 때문에 nextLine을 활용
        System.out.println(T.solution(str));
    }

}