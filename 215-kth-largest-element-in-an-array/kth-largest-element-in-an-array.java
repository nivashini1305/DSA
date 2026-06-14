class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        int ans = nums[len-k];
        // for(int i = len-1; i > len-k-1; i--)
        // {
        //     ans = nums[i]
        // }
        return ans;
    }
}