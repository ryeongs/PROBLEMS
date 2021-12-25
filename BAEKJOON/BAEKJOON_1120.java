import java.util.*;

public class Main {
//Q) A와 B의 길이가 같으면서, A와 B의 차이를 최소가 되도록 했을 때, 그 차이를 출력하시오.
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        int result = a.length();
        
        for(int i=0;i<b.length()-a.length()+1;i++){
            int tmp=0;
            
            for(int j=0;j<a.length();j++){
                if(a.charAt(j)!=b.charAt(j+i)){
                    tmp++;
                }
            }
            if(result > tmp){
                result = tmp;
            }
        }
        //ex) a = "aabb" b = "bbaabc"
        //1번 - a기준 b와 4개 다름
        //b = "bbaa"bc 
        //a = "aabb" 
      
        //2번 - 2개 다름
        //b = b"baab"c
        //a =  "aabb"
      
        //3번 - 1개 다름 
        //b = bb"aabc"
        //a =   "aabb"
      
        System.out.println(result);
    }
}
