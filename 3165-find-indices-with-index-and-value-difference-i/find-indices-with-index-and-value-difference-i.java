class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] answer = new int[2];
        answer[0]=-1;
        answer[1]=-1;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                int val = Math.abs(nums[i]-nums[j]);
                int ind = Math.abs(i-j);
                if(ind >= indexDifference && val >= valueDifference)
                {
                    answer[0]=i;
                    answer[1]=j;
                }
            }
        }
        return answer;
    }
}