class Solution {
    public boolean isPalindrome(int x) {
       String num = x+"";
        int first = 0; 
        int last = num.length()-1; 

        while(first < last){
            if(num.charAt(first) != num.charAt(last)){
                return false;
            }
            first += 1;
            last -= 1;
        }
        return true;
    }
}
