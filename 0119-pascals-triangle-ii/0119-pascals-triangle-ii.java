import java.util.*;
class Solution {
    List<Integer> findRow(int x){
        List<Integer>row=new ArrayList<>();
        for(int i=1;i<=x;i++){
            row.add(findValue(x-1,i-1));
        }
        return row;
    }
    int findValue(int row,int column){
        long ans=1;
        for(int i=0;i<column;i++){
            ans=ans*(row-i);
            ans=ans/(i+1);
        }
        return(int) ans;
        
    }
    public List<Integer> getRow(int rowIndex) {
        return findRow(rowIndex+1);
    }
}