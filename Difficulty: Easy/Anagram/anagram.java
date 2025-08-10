class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length() != s2.length())
        {
            return false;
        }
     HashMap<Character,Integer> map = new HashMap<>();
     for(int i=0;i<s1.length();i++)
     {
         if(map.containsKey(s1.charAt(i)))
         {
            int cnt = map.get(s1.charAt(i));
            map.put(s1.charAt(i),cnt+1);
         }
         else
         {
            map.put(s1.charAt(i),1); 
         }
     }
     for(char ch:map.keySet())
     {
         int count = map.get(ch);
         int cnt =0;
         for(int j=0;j<s2.length();j++)
         {
             if(s2.charAt(j) == ch)
             {
                cnt++;
             }
         }
         if(count != cnt)   return false;
         
        }
        return true;
    }
}