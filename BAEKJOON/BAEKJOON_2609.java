import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(GCD(a, b));
		System.out.println(lcm(a, b));
	}
	//외우자...
  // 유클리드 (a를 b로 나눈 나머지가 0보다 클 때 까지 반복)
	static int lcm(int a, int b){ // 최소 공배수
		// 0이 아닌 두 수의 곱 / 두 수의 최대공약수
	    return a * b / GCD(a,b);
	}
	
	static int GCD(int a, int b){ // 최대 공약수
		if (a%b == 0) {
			return b;
		}
		return GCD(b, a % b);
	}

}
