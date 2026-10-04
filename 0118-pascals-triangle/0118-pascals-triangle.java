import java.util.*;
class Solution {
    List<Integer>getRow(int x){
        List<Integer>temp=new ArrayList<>();

        long ans=1;
        temp.add((int)ans);
        for(int i=0;i<x;i++){
            ans=ans*(x-i);
            ans=ans/(i+1);
            temp.add((int)ans);
        }
        return temp;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>out=new ArrayList<>();
    for(int i=0;i<numRows;i++){
        List<Integer>in=getRow(i);
        
        out.add(in);
    }
    return out;
    }
}