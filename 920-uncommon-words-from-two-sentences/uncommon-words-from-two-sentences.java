class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> res = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        for(int i=0;i<str1.length;i++)
        {
            String s = str1[i];
            if(map.containsKey(s))
            {
                map.put(s,map.get(s)+1);
            }
            else
            {
                map.put(s,1);
            }
        }
        for(int i=0;i<str2.length;i++)
        {
            String s = str2[i];
            if(map.containsKey(s))
            {
                map.put(s,map.get(s)+1);
            }
            else
            {
                map.put(s,1);
            }
        }
        for(String s:map.keySet())
        {
            int cnt = map.get(s);
            if(cnt == 1)
            {
                res.add(s);
            }
        }
    String[] result = new String[res.size()];
    for(int i=0;i<res.size();i++)
    {
        result[i] = res.get(i);
    }
    return result;
    }
}