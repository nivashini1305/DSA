class Solution {
    public int findFinalValue(int[] nums, int original) {
        for(int i=0;i<nums.length;i++)
        {      
            if(original==nums[i])
            {
                i=-1;
                original=original*2;
                
            }
        }
        return original;
    }
}