class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i))) map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else map.put(s.charAt(i),1);
        }
        Comparator<Character> comp = new Comparator<>()
        {
            public int compare(Character c1,Character c2)
            {
                int val=Integer.compare(map.get(c2),map.get(c1));
                if(val==0) return c2.compareTo(c1);
                return val;
            }
        };
        TreeMap<Character,Integer> tMap = new TreeMap<>(comp);
        tMap.putAll(map);
        StringBuilder sb=new StringBuilder();
        for(char c:tMap.keySet())
        {
            for(int i=0;i<map.get(c);i++)
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}