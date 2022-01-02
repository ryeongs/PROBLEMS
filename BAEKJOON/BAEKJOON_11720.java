import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String nums = sc.next();
        int result = 0;
        for(int i = 0; i < num ; i++) {
                result += nums.charAt(i)-'0';
        }
        System.out.print(result);
    }
}
