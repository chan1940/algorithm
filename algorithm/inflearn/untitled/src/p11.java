import java.io.*;
import java.util.Scanner;

public class p11 {

    public int solution(String[] strArr, char t) {
        int answer = 0;
//        String[] strArr = str.toUpperCase().split("");
        //문자열을 입력받고 모두 대문자로 변형 후
        //strArr배열에 한 문자씩 대입
        //String[] strArr = br.readLine().split("");
        //이렇게 바로 입력받아도 될 듯
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].charAt(0) == Character.toUpperCase(t)){
                answer++;
            }
//            if(strArr[i].equalsIgnoreCase(String.valueOf(t))){
//                //String으로 입력받은 애랑 char로 입력받은 애를 비교할 때는 이렇게 작성
//                //equals메서드는 String끼리의 비교를 위한 것임.
//                answer++;
//            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        p11 T = new p11();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        String str = br.readLine();
        String[] strArr = br.readLine().toUpperCase().split("");
        char chr = br.readLine().charAt(0);
        System.out.println(T.solution(strArr,chr));
        bw.write(T.solution(strArr,chr));
        bw.flush();
        bw.close();
    }

}
