class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = -1;
        int smax = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
               smax = max;
               max = arr[i];
            }
            if(arr[i]>smax && arr[i]<max)
            {
                smax = arr[i];
            }
        }
        return smax;
    }
}