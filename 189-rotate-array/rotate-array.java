class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] arr1 = new int[k];
        int[] arr2 = new int[nums.length-k];
        int j=0;
        for(int i=nums.length-k;i<nums.length;i++)
        {
            arr1[j]=nums[i];
            j++;
        }
        for(int i=0;i<nums.length-k;i++)
        {
            arr2[i]=nums[i];
        }
        int ind = 0;
        for(int i=0;i<arr1.length;i++)
        {
            nums[ind]=arr1[i];
            ind++;
        }
        for(int i=0;i<arr2.length;i++)
        {
            nums[ind]=arr2[i];
            ind++;
        }

    }
}