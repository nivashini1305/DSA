class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int sub=target-nums[i];
            if(hash.containsKey(sub))
            {
                return new int[]{hash.get(sub),i};
            }
            else{
                hash.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}