class Solution {
    public int subarraySum(int[] nums, int k) {
        //BRUTE FORCE 
        // int count=0;
        // int sum=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==k)
        //     {
        //         count+=1;
        //     }
        //     sum+=nums[i];
        //     System.out.println("n1 "+nums[i]+" i "+i+" "+sum);
        //         if(sum==k)
        //         {
        //             count+=1;
        //         }
        // }
        // return count;


        //OPTIMAL
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        int result=0;
        int sum=0;
        for(int num:nums)
        {
            sum+=num;
            int check=sum-k;
            if(map.containsKey(check))
            {
                int count=map.get(check);
                result+=count;
            }

            if(map.containsKey(sum))
            {
                int count=map.get(sum);
                map.put(sum,count+1);
            }
            else
            {
                map.put(sum,1);
            }
        }
        return result;
    }
}