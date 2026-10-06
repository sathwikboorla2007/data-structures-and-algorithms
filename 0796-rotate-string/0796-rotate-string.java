class Solution {
    boolean checkRotate(String s,String goal){
        if(s.length()!=goal.length()){
            return false;
        }
        if((s+s).contains(goal)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean rotateString(String s, String goal) {
        
        return checkRotate(s,goal);
    }
}