class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        //기준
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
           //prefix의 문자와 strs[i]의 문자가 서로 같을 때까지 비교 
            while (strs[i].indexOf(prefix) != 0){
                //하나씩 지운다.
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}
