class Solution {
  
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    void merge(int[] nums,int l,int h,int mid)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int left=l;
        int right=mid+1;
        while(left<=mid && right<=h)
        {
            if(nums[left]<=nums[right])
            {
                list.add(nums[left]);
                left++;
            }
            else
            {
                list.add(nums[right]);
                right++;
            }
        }
            while(left<=mid)
            {
                list.add(nums[left]);
                left++;
            }
            while(right<=h)
            {
                list.add(nums[right]);
                right++;
            }
            int index = 0;
            for(int i=l;i<=h;i++)
            {
                nums[i]=list.get(index);
                index++;
            }
        }
    
    int mergeSort(int[] nums,int low,int high)
    {
        int count=0;
        int mid = (low+high)/2;
        if(low==high)
        {
            return count;
        }
        count+=mergeSort(nums,low,mid);
        count+=mergeSort(nums,mid+1,high);
        count+=reverse(nums,low,mid,high);
        merge(nums,low,high,mid);
        return count;
    }
     int reverse(int[] nums,int low,int mid,int high)
    {
        int count=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && nums[i]>(long)2*(long)nums[right])
            {
                right++;
            }
            count=count+(right-(mid+1));
        }
        return count;
    }
}