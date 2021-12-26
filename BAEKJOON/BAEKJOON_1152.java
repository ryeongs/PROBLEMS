import java.io.IOException;
import java.util.Scanner;
public class Main {
  //단어의 개수
    public static void main(String[] args)throws IOException  {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        if(str.isEmpty()){
            System.out.println(0);
        }else {
            System.out.println(str.split(" ").length);
        }
    }
}

