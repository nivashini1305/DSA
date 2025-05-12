class Solution {
    public int reverse(int x) {
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        long var=0;

        while(x!=0){
            int last=x%10;
            x=x/10;
            var= var*10+last;
        }
        if(var<min || var >max){
              return 0;  
           }
           return (int)var;
        }
        
}