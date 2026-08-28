class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
            int revNum=0;
            int lastDigit=0;
            int dup=x;
            while(x>0){
                lastDigit=x%10;
                x=x/10;
                revNum=revNum*10+lastDigit;

        }
        if(revNum==dup){
            return true;
        }
        else{
            return false;
        }
        }
        
    }
}