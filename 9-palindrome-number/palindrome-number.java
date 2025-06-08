class Solution {
    public boolean isPalindrome(int x) {
        int temp=0;
        int n=x;
        while(x>0)
        {
           temp=temp*10+x%10;
           x=x/10;
        }
        if(temp==n)
        {
            return true;
        }
        return false;
    }
}