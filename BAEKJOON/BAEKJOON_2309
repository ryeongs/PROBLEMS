import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //난쟁이 9명 배열 생성
        int[] dwarfs = new int[9];
        //난쟁이들 키 총합
        int totalHeight = 0;
       
        for(int i = 0; i < 9; i++) {
            int height = Integer.parseInt(br.readLine()); //각 난쟁이 키
            dwarfs[i] = height; //각 난쟁이 키를 배열에 저장
            totalHeight += dwarfs[i]; //전체 키를 합산한 값          
        }
        //오름차순으로 난쟁이들 키 정렬     
        Arrays.sort(dwarfs);
        
        //가짜 난쟁이 두명
        int spyA = 0, spyB = 0;
        
        //두개의 값을 체크해야하기 때문에 맨 마지막 값은 안쪽 for문이 처리한다.
        for(int i = 0; i < dwarfs.length- 1; i++) {
            for(int j = i+1; j < dwarfs.length; j++) {
                if(totalHeight - dwarfs[i] - dwarfs[j] == 100) {
                    spyA = i;
                    spyB = j;
                    break;
                }
            }
        }
        
        //가짜 난쟁이를 제외한 난쟁이(진)들 키 출력
        for(int i = 0; i < dwarfs.length; i++) {
            //가짜 난쟁이 키 제외 출력
            if(i != spyA && i != spyB) {
                System.out.println(dwarfs[i]);
            }
        }
    }
}
