import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력받은 숫자를 문자열로 받는다.
        String numberString = br.readLine();
        //입력받은 숫자의 길이
        int numberLength = numberString.length();
        //문자열을 int로 변환
        int number = Integer.parseInt(numberString);
        //결과값
        int result = 0;
        //분해합은 N과 각 자릿수 값의 합이므로 최솟값은 역으로 N에서 더할 수 있는 최대의 자릿수 값들을 빼주면 됩니다. 
        //각 자릿수의 최대값은 9입니다. 9의 자릿수를 곱해서 빼주면 최솟값을 구할 수 있습니다.
        //ex) 216은 3자리입니다. 
        //216 - (3 * 9) = 189 가 최솟값이 됩니다. 
        for(int i = (number - (numberLength * 9)); i < number; i++) {
            int sum = 0; //각 자릿수 합 변수
            int j = i; //한자리씩 구하기 위한 변수
            while (j != 0) {
                sum += j % 10; //각 자릿수 더하기
                j /= 10;
            }
            
            //각 자릿수 누적합과 i가 같을 경우 
            //ex) 18 + 198 == 216
            if(sum + i == number) {
                result = i;
                break;
            } 
        }

        System.out.println(result);
    }
}
