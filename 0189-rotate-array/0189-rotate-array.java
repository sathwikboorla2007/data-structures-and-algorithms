class Solution {
    void rotate(int[] nums,int low,int k,int high){
        
        reverse(nums,low,high);
        reverse(nums,low,k-1);
        reverse(nums,k,high);

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
        if( high<=0 || k<=0)return;
        k=k%high;
        high=high-1;
        
        rotate(nums,low,k,high);
    }
}