class Solution {
    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        k=k%nums.length;
        int j=0;
        for(int i=nums.length-k;i<nums.length;i++)
        {
            if(j==k)
            {
                break;
            }
           res[j]=nums[i];
           j++;
        }
        for(int i=0;i<nums.length-k;i++)
        {
            res[j]=nums[i];
            j++;
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=res[i];
        }
        
    }
}