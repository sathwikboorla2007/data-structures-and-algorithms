import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>mapst=new HashMap<>();
        HashMap<Character,Character>mapts=new HashMap<>();
        int x=s.length();
        int y=t.length();
        if(x!=y){
            return false;
        }
        else{
            for(int i=0;i<x;i++){
                char a=s.charAt(i);
                char b=t.charAt(i);

                if(mapst.containsKey(a) && mapst.get(a)!=b){
                    return false;
                }
                if(mapts.containsKey(b) && mapts.get(b)!=a){
                    return false;
                }
                mapst.put(a,b);
                mapts.put(b,a);

            }
            return true;
        }
        
    }
}