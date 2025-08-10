class Solution {
    public char nonRepeatingChar(String s) {
        // code here
      HashMap<Character,Integer> map = new HashMap<>();
      for(int i=0;i<s.length();i++)
     {
         if(map.containsKey(s.charAt(i)))
         {
            int cnt = map.get(s.charAt(i));
            map.put(s.charAt(i),cnt+1);
         }
         else
         {
            map.put(s.charAt(i),1); 
         }
     }
     
     for(int i=0;i<s.length();i++)
     {
         int count = map.get(s.charAt(i));
         if(count == 1)
         {
             return s.charAt(i);
         }
     }
     return '$';
    }
}
