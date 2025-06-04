class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int[] occurence=searchRange(arr,target);
        if(occurence[0]==-1)
        {
            return 0;
        }
        return occurence[1]-occurence[0]+1;
    }
    public int[] searchRange(int[] nums, int target) {
        int first=first(nums,target);
        if(first==-1)
        {
            int last=-1;
            return new int[]{first,last};
        }
        int last=last(nums,target);
        return new int[]{first,last};
    }
    int first(int arr[],int target)
    {
        int first=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {   
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<=target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return first;
    }
    int last(int arr[],int target)
    {
        int last=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {   
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]>=target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return last;
    }  
}
