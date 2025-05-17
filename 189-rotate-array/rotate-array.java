class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] kArr= new int[k];
        for(int i=nums.length-1;i>=nums.length-k;i--){
            kArr[(nums.length-1)-i]=nums[i];
        }
        int j= nums.length-1;
        for(int i=(nums.length-k)-1;i>=0;i--){
            nums[j]=nums[i];
            j--;
            // System.out.println(nums[i-1]);
        }
        int l=kArr.length-1;
        for(int i=0;i<k;i++){
            nums[i]=kArr[l];
            l--;

        }
    }
}