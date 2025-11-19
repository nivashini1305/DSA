class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> str = new ArrayList<>();     
        HashMap<Character,Integer> map = new HashMap<>();
        char a1[] = {'q','w','e','r','t','y','u','i','o','p'};
        char a2[] = {'a','s','d','f','g','h','j','k','l'};
        char a3[] = {'z','x','c','v','b','n','m'};
        for(int i=0;i<a1.length;i++)
        {
            map.put(a1[i],1);
        }
        for(int i=0;i<a2.length;i++)
        {
            map.put(a2[i],2);
        }
        for(int i=0;i<a3.length;i++)
        {
            map.put(a3[i],3);
        }
        for(int i = 0;i<words.length;i++)
        {
            String wrd = words[i].toLowerCase();
            char a = wrd.charAt(0);
            int row = map.get(a);
            boolean valid = true;

            for(int j=0;j<wrd.length();j++)
            {
                if(map.get(wrd.charAt(j)) != row)
                {
                    valid = false;
                    break;
                }
            }
            if(valid)
            {
                str.add(words[i]);
            }
        }
        String[] arr = new String[str.size()];
        for(int i=0;i<str.size();i++)
        {
            arr[i] = str.get(i);
        }
        return arr;
    }
}