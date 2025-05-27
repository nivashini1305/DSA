class Solution {
    public String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        String string="";
        for(int i=0;i<k-1;i++)
        {
            string+=str[i]+" ";
        }
        string+=str[k-1];
        return string;
    }
}