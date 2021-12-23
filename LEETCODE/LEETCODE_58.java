class Solution {
    public int lengthOfLastWord(String s) {
            return s.trim().length()-s.trim().lastIndexOf(" ")-1;
        //양 끝 공백을 제거한 s의 길이 - 양 끝 공백을 제거한 s의 마지막 공백의 index -1
    }
}
