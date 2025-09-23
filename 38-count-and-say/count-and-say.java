class Solution {
    public String countAndSay(int n) {
        // if(n == 1) return "1";

        String s ="1";
        
        for(int i=1;i<n;i++)
        {
            s = Solution.count(s);
        }
        return s;
    }
    static String count(String s)
    {
        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);
        int count = 1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i) == prev)
            {
                count++;
            }
            else
            {
                sb.append(count);
                sb.append(prev);
               
                prev = s.charAt(i);
                count = 1;
            }
            
        } 
            sb.append(count);
            sb.append(prev);
            
            return sb.toString();
    }
}