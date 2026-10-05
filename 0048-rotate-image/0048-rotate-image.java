class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int i=0;i<n;i++){
            
                int left=0;
                int right=n-1;
                while(left<right){
                    int temp1=matrix[i][left];
                    matrix[i][left]=matrix[i][right];
                    matrix[i][right]=temp1;
                    left++;
                    right--;
                }
            
        }
    }
}