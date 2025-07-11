class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int index=0;
        String str1=strs[0];
        String str2=strs[strs.length-1];
        while(index<str1.length())
        {
            if(str1.charAt(index)==str2.charAt(index))
            {
                index++;
            }
            else
            {
                break;   
            }
        }
        if(index==0)
        {
            return "";
        }
        return str1.substring(0,index);
    }
}