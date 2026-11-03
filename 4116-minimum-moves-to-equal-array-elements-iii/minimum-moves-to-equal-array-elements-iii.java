class Solution {
    public int minMoves(int[] nums) {
        int max =0;
        int count=0;
        int i=0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                }
            }
        for(i=0; i<nums.length; i++){
            if(nums[i]<max){
                count+=max-nums[i];
            }
        }
        return count;
    }
}