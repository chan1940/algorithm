import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class p17219 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        HashMap<String, String> map = new HashMap();


        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String url = st.nextToken();
            String pwd = st.nextToken();
            map.put(url,pwd);
        }

        for(int i=0; i<M; i++){
            String str = br.readLine();
            bw.write(map.get(str) + "\n");
        }
        bw.close();
    }
}
