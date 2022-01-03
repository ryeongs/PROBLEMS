import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
          Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();
        String reverse1 = "";
        String reverse2 = "";

        for(int i = n1.length()-1; i >= 0; i--) {
            reverse1 += n1.charAt(i)-'0';
            reverse2 += n2.charAt(i)-'0';
        }
        System.out.println(Integer.parseInt(reverse1) > Integer.parseInt(reverse2) ? reverse1 : reverse2);
    }
}
