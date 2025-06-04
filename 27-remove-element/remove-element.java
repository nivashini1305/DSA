class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0; 
        // int k=0;
        if(nums.length==1)
        {
            if(nums[0]==1) return 0;
            else return 1;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}