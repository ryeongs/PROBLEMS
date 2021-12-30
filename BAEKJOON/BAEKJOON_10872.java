import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(fact(num));
    }
    public static int fact(int n) {
        if (n <= 1)
            return 1;
        else
            return fact(n-1) * n;
    }
}
