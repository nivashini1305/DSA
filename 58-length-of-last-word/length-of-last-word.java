class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        String string=str[str.length-1];
        return string.length();

    }
}