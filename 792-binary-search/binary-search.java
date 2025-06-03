class Solution {
    public int search(int[] nums, int target) {
         return bs(nums,0,nums.length-1,target);
    }
    int bs(int[] nums,int low,int high,int target)
    {
        int mid=(low+high)/2;
        if(low>high)
        {
            return -1;
        }
        if(nums[mid]==target)
        {
            return mid;
        }
        else if(target>nums[mid])
        {
            return bs(nums,mid+1,high,target);
        }
        else
        {
            return bs(nums,low,mid-1,target);
        }
    }
}