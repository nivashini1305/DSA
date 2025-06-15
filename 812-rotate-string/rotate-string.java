class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        {
            return false;
        }
        String ans=s+s;
        int ind=ans.indexOf(goal);
        if(ind!=-1)
        {
            return true;
        }
        return false;
    }
}