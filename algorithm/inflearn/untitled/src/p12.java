import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class p12 {

    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }


//        char[] chArr = str.toCharArray();
//        for (int i = 0; i < chArr.length; i++) {
//            if (97 <= chArr[i] && chArr[i] <= 122) {
//                chArr[i] -= 32;
//            } else if (65 <= chArr[i] && chArr[i] <= 90) {
//                chArr[i] += 32;
//            }
//        }
//        answer = Arrays.toString(chArr);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        p12 T = new p12();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        System.out.println(T.solution(str));
    }

}
