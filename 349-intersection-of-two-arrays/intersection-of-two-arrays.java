class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(map.containsKey(nums1[i]))
            {
                map.put(nums1[i],map.get(nums1[i])+1);
            }
            else
            {
                map.put(nums1[i],1);
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(map.containsKey(nums2[i]))
            {
                set.add(nums2[i]);
            }
        }
        int[] arr = new int[set.size()];
        int j=0;
        for(int i:set)
        {
            arr[j] = i;
            j++;
        }
        return arr;
        
    }
}