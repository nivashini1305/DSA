
//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        int max=Integer.MIN_VALUE;
        int sum=0;
        int ans=-1;
        if(arr.length<k)
        {
            return ans;
        }
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            max=Math.max(arr[i],max);
        }
        int low=max;
        int high=sum;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int totalStd=fn(arr,mid);
            if(totalStd>k)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
                ans=mid;
            }
        }
        return ans;
    }
    static int fn(int[] arr,int maxPage)
    {
         int stdcnt=1;
         long page=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]+page<=maxPage)
            {
                page+=arr[i];
            }
            else
            {
                page=arr[i];
                stdcnt++;
            }
        }
        return stdcnt;
    }
    
}