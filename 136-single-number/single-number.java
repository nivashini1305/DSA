class Solution {
    public int singleNumber(int[] nums) {
      HashMap<Integer,Integer> hashmap = new HashMap<>();
      for(int i=0;i<nums.length;i++){
        if(hashmap.containsKey(nums[i])){
            int count = hashmap.get(nums[i]);
            hashmap.put(nums[i],count+1);
        }
        else{
             hashmap.put(nums[i],1);
        }
      }
      for(int i=0;i<nums.length;i++){
        int count=hashmap.get(nums[i]);
        if(count==1)
        {
            return nums[i];
        }
      }
      return -1;
    }
}