class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
        }
        Comparator<Character> comp = new Comparator<>()
        {
            public int compare(Character a1,Character a2)
            {
                int diff = Integer.compare(map.get(a2),map.get(a1));
                if(diff==0) return a1.compareTo(a2);
                return diff;
            }
        };

        TreeMap<Character,Integer> tMap = new TreeMap<>(comp);
        tMap.putAll(map);

        StringBuilder sb = new StringBuilder();
        for(var a:tMap.keySet())
        {
            for(int i=0;i<map.get(a);i++)
            {
                sb.append(a);
            }
        }
        return sb.toString();
    }
}