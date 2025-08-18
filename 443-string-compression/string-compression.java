class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1) return 1;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<chars.length;i++)
        {
            if(chars[i] == chars[i-1]) count++;
            else
            {
                if(count == 0) sb.append(chars[i-1]);
                else
                {
                    sb.append(chars[i-1]);
                    sb.append(count+1);
                    count = 0;
                }
                
            } 
        }
        if(count == 0) sb.append(chars[chars.length-1]);
        else
        {
            sb.append(chars[chars.length-1]);
            sb.append(count+1);
        }
        for(int i=0;i<sb.length();i++)
        {
            chars[i] =  sb.charAt(i);
        }
        return sb.length();
    }
}