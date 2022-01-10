import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = st.nextToken();	// 나이
            arr[i][1] = st.nextToken();	// 이름
        }
        
        Arrays.sort(arr, new Comparator<String[]>() {
            // 나이순으로 정렬
            //양의 정수, 0, 음의 정수 중 하나를 반환하며, 양의 정수일 경우만 두 객체의 위치를 바꿔주는 역할을 한다
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }

        });

        StringBuilder sb = new StringBuilder();
        //출력
        for(int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
        }

        System.out.println(sb);
    }
}

