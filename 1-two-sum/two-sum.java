class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j=0;
        int[] result = new int[2];
        for(int i=j+1;i<nums.length;i++)
        {
            if(nums[i]+nums[j]==target){
                result[0]=j;
                result[1]=i;
                break;
            }
            if(i==nums.length-1){
                i=j+1;
                j+=1;
            }
            if(j==nums.length-2 && i== nums.length-1 ){
                break;
            }
        }
        return result;
    }
}