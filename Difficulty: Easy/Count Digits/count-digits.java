class Solution {
    public int countDigits(int n) {
        int count=0;
        // code here
        while(n>0)
        {
            int lastDigit=n%10;
            count+=1;
            n=n/10;
        }
        return count;
    }
}
