class Solution {
    boolean checkRotate(String s,String goal){
        
        for(int i=0;i<s.length();i++){
            String left=s.substring(0,i+1);
            String right=s.substring(i+1,s.length());
            String newString=right+left;
            if(goal.equals(newString)){
                return true;
            }
        }
        return false;
    }
    public boolean rotateString(String s, String goal) {
        
        return checkRotate(s,goal);
    }
}