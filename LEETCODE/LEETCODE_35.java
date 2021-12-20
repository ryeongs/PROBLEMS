class Solution {
    public int searchInsert(int[] nums, int target) {
        //target이 마지막 값보다 클 경우 
        if(target > nums[nums.length - 1]) {
            return nums.length;
        }

        //이진탐색법.. 반 자르고 찾고 반 자르고 찾고..
        int left = 0; //첫번째
        int right = nums.length - 1; //마지막
        while(left <= right) {  
            //반 자른거
            int mid = (right - left) / 2 + left;
            // 반 자른거랑 같으면..
            if(nums[mid] == target) {
                return mid;
            }
            //반 자른게 큰면..
            else if(target < nums[mid]) {
                right = mid - 1;
            }
            //반 자른게 작으면..     
            else { // target > nums[mid]
                left = mid + 1;
            }
        }
        return left;
    }
    
}
