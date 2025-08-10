class Solution {
    public int countVowelSubstrings(String word) {
        int count =0;
        for(int i=0;i<word.length();i++)
        {
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<word.length();j++)
            {
                char ch = word.charAt(j);
                if(ch == 'a' || ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u')
                {
                    sb.append(ch);
                    String s=sb.toString();
                    if(s.contains("a") && s.contains("e") && s.contains("i") && s.contains("o") && s.contains("u") )
            {
                count++;
            }
                }
                else break;
            }
    }
    return count;
    }
}
