class Solution {
    public String sortSentence(String s) {
        String[] str= s.split(" ");
        String arr[] = new String[str.length];
        for(String string:str)
        {
            int n=Integer.parseInt(string.substring(string.length()-1));
            arr[n-1]=string.substring(0,string.length()-1);
        }
        return String.join(" ",arr);
    }
}