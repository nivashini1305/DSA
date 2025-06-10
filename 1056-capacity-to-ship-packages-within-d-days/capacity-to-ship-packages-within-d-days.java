class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++)
        {
            max=Math.max(weights[i],max);
            sum+=weights[i];
        }
        int low=max;
        int high=sum;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int day=days(weights,mid);
            if(day>days)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return low;
    }
    int days(int[] nums,int capacity)
    {
        int load=0;
        int days=1;
        for(int i=0;i<nums.length;i++)
        {
            if(load+nums[i]>capacity)
            {
                days++;
                load=nums[i];
            }
            else
            {
                load+=nums[i];
            }
        }
        return days;
    }
}