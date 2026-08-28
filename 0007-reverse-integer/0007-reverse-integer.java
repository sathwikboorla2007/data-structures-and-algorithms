class Solution {
    public int reverse(int x) {
        long revNum=0;
        int lastDigit=0;
        
        if(x<0){
            x=x*(-1);
            while(x>0){
            lastDigit=x%10;
            x=x/10;
            revNum=revNum*10+lastDigit;

        }
        if(revNum>Integer.MAX_VALUE|| revNum<Integer.MIN_VALUE){
            return 0;
        }
        else{
            return (int) -(revNum);
        }
        
        }
        while(x>0){
            lastDigit=x%10;
            x=x/10;
            revNum=revNum*10+lastDigit;

        }
         if(revNum>Integer.MAX_VALUE|| revNum<Integer.MIN_VALUE){
            return 0;
        }
        return (int) revNum;
    }
}