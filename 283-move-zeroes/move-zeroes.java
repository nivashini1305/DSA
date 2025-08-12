class Solution {
    public void moveZeroes(int[] nums) {
        int p1=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0)
            {
                p1 = i;
                break;
            }
        }
        if(p1 == nums.length-1 || p1 == -1)
        {
           return;
        }
        for(int j=p1+1;j<nums.length;j++)
        {
            if(nums[j] != 0)
            { 
                nums[p1] = nums[j];
                nums[j] = 0;
                p1++;
            }
        }
    }
}