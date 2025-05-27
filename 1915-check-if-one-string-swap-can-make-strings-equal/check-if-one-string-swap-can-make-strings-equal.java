class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        boolean flag = false;
        if(s1.equals(s2))
        {
            return true;
        }
        ArrayList<Integer> index=new ArrayList<>();
        for(int i=0;i<s1.length();i++)
        {
               if(s1.charAt(i)!=s2.charAt(i))
               {
                index.add(i);
               }
        }
        if(index.size() !=2 )
        {
            return false;
        }
        int i=index.get(0);
        int j=index.get(1);
        return s1.charAt(i)==s2.charAt(j) && s2.charAt(i)==s1.charAt(j) ;
    }
}