class Solution {
    public int lcm(int a, int b) {
        
        return (a*b)/gcd(a,b);
         
    }
    int gcd(int a,int b)
    {
        if(b>a)
        {
            int temp = b;
            b = a;
            a = temp;
        }
        int rem = 1;
        while(rem > 0)
        {
            rem = a%b;
            a = b;
            b = rem;
        }
        return a;
    }
}