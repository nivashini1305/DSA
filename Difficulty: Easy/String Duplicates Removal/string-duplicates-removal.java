// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(sb.toString().contains(s.substring(i,i+1)))
            {
                continue;
            }
            else
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
