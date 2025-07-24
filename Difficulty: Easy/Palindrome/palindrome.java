class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int num = n;
        int temp=0;
        while(n>0)
        {
            int rem = n%10;
            temp=temp*10+rem;
            n=n/10;
        }
        // System.out.print(num);
        if(temp == num)
        {
            return true;
        }
        return false;
    }
    
}