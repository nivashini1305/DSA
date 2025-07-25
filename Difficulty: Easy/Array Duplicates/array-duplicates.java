class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int count = map.get(arr[i]);
                map.put(arr[i],count+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        for(int i : map.keySet())
        {
            int count = map.get(i);
            // System.out.println(count);
            if(count>1)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}