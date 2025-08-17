class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = 0;
        while(left < word1.length() && right < word2.length())
        {
            sb.append(word1.charAt(left));
            sb.append(word2.charAt(right));
            left++;
            right++;
        }
        // for(int i =0;i<Math.min(word1.length(),word2.length());i++)
        // {
        //     sb.append(word1.charAt(i));
        //     sb.append(word2.charAt(i));
        //     left++;
        //     right++;
        //     System.out.println("l "+ left + " r "+ right);
        // }
        while(left < word1.length())
        {
            sb.append(word1.charAt(left));
            left++;
        }
        while(right < word2.length())
        {
            sb.append(word2.charAt(right));
            right++;
        }
        return sb.toString();
    }
}