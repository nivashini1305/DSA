class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        char[] a = str.toCharArray();
        for(int i= str.length(); i>0; i--)
        {
            if(a[str.length()-i]  != a[i-1])
            {
                return false;
            }
        }
        return true;
    }
}