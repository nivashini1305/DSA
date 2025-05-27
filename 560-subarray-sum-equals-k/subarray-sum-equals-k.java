class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==k)
            {
                count+=1;
            }
            int sum=nums[i];
             for(int j=i+1;j<nums.length;j++)
            {
                sum+=nums[j];
                // System.out.println("n1 "+nums[i]+" i "+i+"  n2 "+nums[j]+" j "+j+" "+sum);
                if(sum==k)
                {
                    count+=1;
                }
            }
        }
        return count;
    }
}