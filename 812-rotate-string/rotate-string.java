class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        {
            return false;
        }
        String ans=s+s;
        int ind=ans.indexOf(goal);
        // System.out.println(ans+" "+ind);
        if(ind!=-1)
        {
            return true;
        }
        // for(int i=0;i<goal.length();i++)
        // {
        //     if(goal.charAt(i)!=ans.charAt(ind))
        //     {
        //         return false;
        //     }
        // }
        return false;
    }
}