class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m;i<nums1.length;i++)
        {
            nums1[i] = nums2[j];
            j++;
        }
        int low = 0;
        int high = nums1.length-1;
        mergeSort(nums1,low,high);

    }
    void mergeSort(int[] arr,int low,int high)
    {
        if(low >= high) return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        mergeArr(arr,low,mid,high);
    }
    void mergeArr(int[] arr,int low,int mid,int high)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while( left<=mid && right<=high )
        {
            if(arr[left]<=arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else
            {
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            temp.add(arr[left]);
            left++;
        }
        while(right<=high)
        { 
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++)
        {
            arr[i] = temp.get(i-low);
        }
    }
}