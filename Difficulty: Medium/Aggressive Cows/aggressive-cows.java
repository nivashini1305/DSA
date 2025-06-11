// User function Template for Java
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int low=0;
        int high=stalls[stalls.length-1]-stalls[0];
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(check(stalls,mid,k))
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
    static boolean check(int[] arr,int distance,int cows)
    {
        int cowCount=1;
        int stl=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-stl>=distance)
            {
                cowCount++;
                stl=arr[i];
            }
        }
         if(cowCount>=cows)
            {
                return true;
            }
        return false;
    }
}