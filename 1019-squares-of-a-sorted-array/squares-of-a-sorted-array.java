class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int[] arr=new int[nums.length];
        int start=0,end=0;
        int n=arr.length-1;
        while(i<=j){
            start=nums[i]*nums[i];
            end=nums[j]*nums[j];
            if(end>start){
                arr[n]=end;
                j--;
            }
            else{
                arr[n]=start;
                i++;
            }
            n--;
        }
        return arr;
    }
}