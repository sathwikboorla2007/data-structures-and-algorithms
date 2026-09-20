class Solution {
    void rotate(int[] nums,int low,int k,int high){
        
        reverse(nums,low,high-1);
        reverse(nums,low,k-1);
        reverse(nums,k,high-1);

    }
    void reverse(int []nums,int low,int high){
        
        while(low<=high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
        
        

    }
    public void rotate(int[] nums, int k) {
        
        int low=0;
        int high=nums.length;
        k=k%high;
        if(high<=1)return;
        rotate(nums,low,k,high);
    }
}