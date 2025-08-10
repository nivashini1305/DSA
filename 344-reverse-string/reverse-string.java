class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int p2 = s.length-1;
        while(i<p2)
        {
            char temp = s[i];
            s[i] = s[p2];
            s[p2] = temp;
            p2--;
            i++;
        }
    }
}