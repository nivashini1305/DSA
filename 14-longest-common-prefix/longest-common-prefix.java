class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)
        {
            return strs[0];
        }
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();       
        // int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++)
        {
            min = Math.min(min,strs[i].length());
            // max = Math.max(max,strs[i].length());
        }
        int ind = 0;
        while(ind<min)
        {
            if(strs[0].charAt(ind) == strs[strs.length-1].charAt(ind))
            {
                sb.append(strs[0].charAt(ind));
                ind++;
            }
            else
            {
                return sb.toString();
            }
        }
        return sb.toString();
    }
}