import java.io.*;
import java.util.HashMap;
import java.util.SimpleTimeZone;
import java.util.StringTokenizer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class p41 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        HashMap<String , Integer> map = new HashMap();


        int N = Integer.parseInt(br.readLine());

        String M = br.readLine();
        String[] a = M.split("");

        for(int i=0; i<N; i++){
            map.put(a[i],0);
        }

        for(int i=0; i<N; i++){
            if(map.containsKey(a[i])){
                map.put(a[i],(map.get(a[i]))+1);
            }
        }

        int max = 0;
        String answer ="";
        for(int i=0; i<map.size(); i++){
            if(max<map.get(a[i])){
                max = map.get(a[i]);
                answer = a[i];
            }

        }
        bw.write(answer);
        bw.close();
    }
}