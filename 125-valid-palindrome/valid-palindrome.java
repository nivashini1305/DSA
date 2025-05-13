class Solution {
    public boolean isPalindrome(String s) {
        String temp = "";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                temp += Character.toLowerCase(s.charAt(i));
            }
        }
        System.out.print(temp);
       return calc(0,temp);
    }
    boolean calc(int i,String s)
    {
        if(i>=s.length()/2){
            return true;
        }
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }

            return calc(++i,s);
        
        }
    }
