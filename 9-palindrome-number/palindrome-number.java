class Solution {
    public boolean isPalindrome(int x) {
        int temp=0;
        int num=x;
        if(x<0)
        return false;
        else{
            while(x>0){
            int remainder=x%10;
            x=x/10;
            temp= temp*10+remainder;
            }
        }
        if(num==temp){
                return true;
            }
            return false;
    }
}