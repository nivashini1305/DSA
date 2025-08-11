class Solution {
    public String toggleCase(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch >= 97)
            {
               int c = ch-32;
               sb.append((char)c); 
            }
            else if(ch <= 97)
            {
                int c = ch+32;
                sb.append((char)c);
            }
        }
        return sb.toString();
    }
}
