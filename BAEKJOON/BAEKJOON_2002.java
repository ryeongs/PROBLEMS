import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String , Integer> map = new HashMap<>();
        int answer = 0;

        for(int i=0; i<N; i++) {
            String input = br.readLine();
            map.put(input, i);
        }
        int[] out = new int[N];

        for(int i=0; i<N; i++) {
            String input = br.readLine();
            out[i] = map.get(input);
        }

        for(int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++) {
                if(out[i]>out[j]) {
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer);
    }



}
