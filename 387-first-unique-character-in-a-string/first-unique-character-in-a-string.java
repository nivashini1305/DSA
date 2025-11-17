class Solution {
    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int ind = map.get(arr[i]);
                map.put(arr[i],-1);
            }
            else
            {
                map.put(arr[i],i);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            int ind = map.get(arr[i]);
            if(ind != -1)
            {
                return ind;
            }
        }
        return -1;
    }
}