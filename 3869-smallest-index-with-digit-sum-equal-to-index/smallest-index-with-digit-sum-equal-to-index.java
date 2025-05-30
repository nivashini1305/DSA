class Solution {
    public int smallestIndex(int[] nums) {
        int hash[]= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            if(nums[i]<=9 )
            {
                hash[i]=nums[i];
               
            }
            else{
                    while(nums[i]>=1)
                    {
                    int n1=nums[i]%10;
                    // if(n1==0)n1=1;
                    sum+=n1;
                    nums[i]=nums[i]/10;
                    }
                    hash[i]=sum;
                }
            }
        
        for(int i=0;i<hash.length;i++)
        {
            if(hash[i]==i)
              return i;
        }
        return -1;
    }
}