class Solution {

    static int findFloor(int[] arr, int x) {
        // write code here
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        int mid=0;
        // for(int i=0;i<arr.length;i++)
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]<=x)
            {
                ans=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return ans;
    }
}
