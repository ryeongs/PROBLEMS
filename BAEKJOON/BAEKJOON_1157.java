import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //알파벳 개수
        int[] arr = new int[26];
        //입력받은거 대문자로 바꾸기
        String str = sc.next().toUpperCase();

        int max = -1;
        char result = '?';

        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i)-65]++;
            if(max < arr[str.charAt(i)-65]){
                max = arr[str.charAt(i)-65];
                result = str.charAt(i);
            } else if(max == arr[str.charAt(i)-65]) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
