// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int temp = 0;
        int temp1 = 0;
        while(n>0)
        {
          
          temp=n%10;
          temp1=temp1*10+temp;
          n=n/10;
          
        }
        return temp1;
    }
}