class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int element1=0;
        int element2=0;
        int count2=0;
        int count1=0;
        for(int i=0;i<nums.length;i++)
        {
        if(count1==0 && nums[i]!=element2)
        {
            element1=nums[i];
            count1++;
        }
        else if(count2==0 && nums[i]!=element1)
        {
            element2=nums[i];
            count2++;
        }
        else if(nums[i]==element1)
        {
            count1++;
        }
        else if(nums[i]==element2)
        {
            count2++;
        }
        else
        {
            count1--;
            count2--;
        }
        }
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==element1)
            {
                cnt1++;
            }
            else if(nums[i]==element2)
            {
                cnt2++;
            }
        }
        if(cnt1>nums.length/3)
            {
                arr.add(element1);
            }
        if(cnt2>nums.length/3)
            {
                arr.add(element2);
            }
        return arr;
    }
}
