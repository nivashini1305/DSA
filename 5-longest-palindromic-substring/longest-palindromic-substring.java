class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        String maxSub="";
        for(int i=0;i<s.length();i++)
        {
            int l=i;
            int r=i;
            while(l>=0 && r<s.length() && s.charAt(r)==s.charAt(l))
            {
                if(max<r-l+1)
                {
                    max=r-l+1;
                    maxSub=s.substring(l,r+1);
                }
                l-=1;
                r+=1;
            }
             l=i;
             r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
            {
                if(max<r-l+1)
                {
                    max=r-l+1;
                    maxSub=s.substring(l,r+1);
                }
                l-=1;
                r+=1;
            }
        }
        return maxSub; 
    }
}