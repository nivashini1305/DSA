class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
            Arrays.sort(nums);
            return;
        }
        for(int i=nums.length-1;i>index;i--)
        {
            if(nums[index]<nums[i])
            {
                int immediate=nums[i];
                nums[i]=nums[index];
                nums[index]=immediate;
                break;

            }
        }
        int low=index+1;
        int high= nums.length-1;
        while(low<high)
        {
            int temp=nums[high];
            nums[high]=nums[low];
            nums[low]=temp;
            low++;
            high--;
        }
    }
}