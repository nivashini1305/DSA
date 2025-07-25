class Solution {
    boolean isPalindrome(String s) {
        // code here
        // String ans = "";
        // for(int i=s.length()-1;i>=0;i++)
        // {
        //     char ch1 = s.charAt(i);
        //     char ch2 = s.charAt(s.length() - i+1);
        //     System.out.println(ch1+" "+ch2);
        //     if(ch1 == ch2)
        //     {
        //         continue;
        //     }
        //     else
        //     {
        //         return false;
        //     }
        // }
        // return true;
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        String ans = str.toString();
        if(ans.equals(s))
        {
            return true;
        }
        return false;
    }
}