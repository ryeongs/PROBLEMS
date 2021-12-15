class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean trueOrFalse = false;
        int cnt = 0;
        for(int i = 0 ; i < nums.length - 1; i++){
            if(nums[i]==nums[i+1]) { cnt++; }
        }
        if(cnt > 0){ trueOrFalse = true; }
        return trueOrFalse;
    }
}