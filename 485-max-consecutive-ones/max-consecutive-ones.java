class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count1=0;
        int max=Integer.MIN_VALUE;
        // if(nums.length==1 && nums[0]==1 ){
        //         return 1;
        //     }
        // else if(nums.length==1 && nums[0]==0){
        //         return 0;
        //     }
        for(int i=0;i<nums.length;i++){
             if(nums[i]==1){
                count1+=1;
                // System.out.println("count1: "+count1);
            }
            // else if(arr[i]==0){
            //     count0+=1;
            //     // System.out.println("count0: "+count0);
            // }   
            
            else{
                max=Math.max(max,count1);
                count1=0;
                // count0=1;
            }
            // max=Math.max(max,count0);
            
           
        }
        max=Math.max(max,count1);
        return max;
    }
}