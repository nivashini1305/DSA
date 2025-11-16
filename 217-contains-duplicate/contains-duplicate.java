class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int count = map.get(nums[i]);
                map.put(nums[i],count+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            int count = map.get(nums[i]);
            if(count > 1)
            {
                return true;
            }
        }
        return false;
    }
}