class Solution {
    public int climbStairs(int n) {
        int count = 1;
        int ans = 0;
        int a = 0;
        int b = 1;
        while(count <= n)
        {
            ans = a + b;
            a = b;
            b = ans;
            count+=1;
        }
        return ans;
    }
}