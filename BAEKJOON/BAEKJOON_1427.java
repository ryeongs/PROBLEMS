import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        char[] result = num.toCharArray();
        Arrays.sort(result);

        //내림차순
        for(int i = result.length-1; i >=0; i--) {
            System.out.print(result[i]);
        }
    }

}
