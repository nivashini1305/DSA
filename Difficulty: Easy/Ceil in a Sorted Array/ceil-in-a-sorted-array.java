// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        int mid=0;
        for(int i=0;i<arr.length;i++)
        {
            mid=(low+high)/2;
            if(arr[mid]>=x)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}
