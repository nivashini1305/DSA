class Solution {
    public int missingNumber(int[] nums) {
        int[] hashArray = new int[nums.length+1];
        for(int singleNum:nums){
            hashArray[singleNum]=singleNum;
        }
        for(int i=1;i<=nums.length;i++){
            if(hashArray[i]==0){
                return i;
            }
        }
        return 0;
    }
}