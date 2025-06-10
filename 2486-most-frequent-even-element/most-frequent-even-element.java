class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<=nums.length-1;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int count=map.get(nums[i]);
                map.put(nums[i],count+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        int max=Integer.MIN_VALUE;
        int ans=-1;
        for(int i=0;i<=nums.length-1;i++)
        {
            if(nums[i]%2==0)
            {
               int count=map.get(nums[i]); 
               if(max==count)
               {
                  ans=Math.min(ans,nums[i]);
               } 
               if(max<count)
               {
                  max=count;
                  ans=nums[i];
               }  
            }
        }
        
        return ans;
    }
}