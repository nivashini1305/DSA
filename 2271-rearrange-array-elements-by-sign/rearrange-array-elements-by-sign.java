class Solution {
    public int[] rearrangeArray(int[] nums) {
        // BRUTE FORCE
        // ArrayList<Integer> pos= new ArrayList<>();
        // ArrayList<Integer> neg= new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<0)
        //     {
        //         neg.add(nums[i]);
        //     }
        //     else
        //     {
        //         pos.add(nums[i]);
        //     }
        // }
        // int j=0;
        // int k=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(i%2==0)
        //     {
        //         nums[i]=pos.get(j);
        //         j++;
        //     }
        //     else{
        //        nums[i]=neg.get(k);
        //        k++; 
        //     }
        // }
        // return nums;
        int arr[] = new int[nums.length];
        int j=0;
        int k=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                arr[j]=nums[i];
                j+=2;
            }
            else{
                arr[k]=nums[i];
                k+=2;
            }

        }
        return arr;
    }
}