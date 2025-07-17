class Solution {
    public int addDigits(int num) {
        int sum = 0;
        int n = num;
        while(n > 0)
        {
            sum += n % 10;
            n = n/10;
            if(n == 0 && sum > 9)
            {
                n=sum;
                sum = 0;
            }
        }
        return sum;
    }
}