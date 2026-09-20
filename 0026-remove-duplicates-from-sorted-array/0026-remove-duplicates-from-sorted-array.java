class Solution {
     int remove(int[] arr,int high){
        int i=0;
        for(int j=1;j<high;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;

     }

    public int removeDuplicates(int[] nums) {
        
        int high=nums.length;
        int k=remove(nums,high);
        return k;
        
    }
}