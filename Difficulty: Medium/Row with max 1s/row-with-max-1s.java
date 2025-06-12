// User function Template for Java

class Solution {
    int lowerBound(int arr[],int i,int k)
    {
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid] >= k)
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
    public int rowWithMax1s(int arr[][]) {
        // code here
        int ind=-1;
        int countMax=0;
        for(int i=0;i<arr.length;i++)
        {
            int count=arr[i].length-lowerBound(arr[i],arr[i].length,1);
            if(count>countMax)
            {
                countMax=count;
                ind=i;
            }
        }
        return ind;
    }
}