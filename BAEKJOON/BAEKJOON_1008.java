import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)throws IOException  {
        //input
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        //output
        System.out.println(a/b);
    }
}

