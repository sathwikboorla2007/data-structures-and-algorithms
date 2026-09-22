class Solution {
    int maxOnes(int[] nums,int high){
        int count=0;
        int max=0;
        for(int i=0;i<high;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            if(max<count){
                max=count;
            }
        }
        return max;
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int high=nums.length;
        return maxOnes(nums,high);
    }
}