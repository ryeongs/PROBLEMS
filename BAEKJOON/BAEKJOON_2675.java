import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스 개수
        for (int i = 0; i < t; i++) {
            int r = sc.nextInt(); // 반복될 개수
            String s = sc.next(); // 반복될 문자

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) { // r만큼
                    System.out.print(s.charAt(j)); // P
                }
            }
            System.out.println();
        }
    }
}
