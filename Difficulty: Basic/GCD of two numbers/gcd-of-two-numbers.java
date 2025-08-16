class Solution {
    public static int gcd(int a, int b) {
        // code here
        if(b>a){
            int temp = a;
            a = b;
            b = temp;
        }
        int ans = 1;
        while(ans>0)
        {
            ans = a%b;
            a = b;
            b = ans;
        }
        return a;
    }
}
