import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class p1620 {
    static String str;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> map = new HashMap<>();
        for(int i = 1; i <= N; i++){
            String ss = br.readLine();
            String num = Integer.toString(i);
            map.put(num,ss);
            map.put(ss,num);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++){
            str = br.readLine();
            if(isInteger()){
                sb.append(map.get(str) + "\n");
            }
            else {
                sb.append(map.get(str) + "\n");
            }
        }
        System.out.println(sb.toString());

    }

    private static boolean isInteger() {
        for(int j=0; j<str.length(); j++){
            if(Character.isDigit(str.charAt(j))){
                return true;
            }
        }
        return false;
    }
}
