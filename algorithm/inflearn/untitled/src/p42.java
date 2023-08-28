import java.io.*;
import java.util.HashMap;
import java.util.Iterator;

public class p42 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();

        String N = br.readLine();
        String[] a = N.split("");

        for(int i=0; i<a.length; i++){
            map1.put(a[i],0);
        }
        for(int i=0; i<a.length; i++){
            if(map1.containsKey(a[i])){
                map1.put(a[i],map1.get(a[i])+1);
            }
        }

        String M = br.readLine();
        String[] b = M.split("");

        for(int i=0; i<b.length; i++){
            map2.put(b[i],0);
        }
        for(int i=0; i<b.length; i++){
            if(map2.containsKey(b[i])){
                map2.put(b[i],map2.get(b[i])+1);
            }
        }

        System.out.println(map1);
        System.out.println(map2);

        Iterator<String> iterator1 = map1.keySet().iterator();
        Iterator<String> iterator2 = map2.keySet().iterator();
        int sum=0, i =0;
        int[] same = new int[map1.size()];
        while(iterator1.hasNext()){
            String keyOfMap1 = iterator1.next();
            String keyOfMap2 = iterator2.next();
            if(keyOfMap1.equals(keyOfMap2)) {
                if(map1.get(keyOfMap1).equals(map2.get(keyOfMap2))){
                    same[i] = 1;
                    sum+=same[i];
                }
                else{
                    same[i] = 0;
                }
            }
            i++;
        }
        System.out.println(sum);
        System.out.println(same.length);
        if(sum==same.length){
            bw.write("YES");
        }
        else{
            bw.write("NO");
        }




        bw.close();

    }
}
