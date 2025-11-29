class Solution {
    public boolean checkRecord(String s) {
        char[] arr = s.toCharArray();
        int l = 0;
        int a = 0;
        for(char c: arr)
        {
            if(c == 'A')
            {
                a++;
                if(a >= 2) return false;
                l=0;
            }
            else if(c == 'L')
            {
                l++;
                if(l >= 3) return false;
            }
            else
            {
                l=0;
            }
        }
        return true;
    }
}