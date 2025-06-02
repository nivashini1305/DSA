class Solution {
    public String reverseWords(String s) {
        String[] split=s.trim().split("\\s+");
        String res="";
        for(int i=split.length-1;i>=0;i--)
        {
            if(i==0)
            {
                res+=split[i];
            }
            else
            {
                res+=split[i]+" ";
            }
            
        }
        return res;
    }
}