class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        int scndMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==max)
            {
                continue;
            }
            if(arr[i] > max)
            {
                scndMax = max;
                max=arr[i];
            }
            else if(scndMax < arr[i])
            {
                scndMax=arr[i];
            }
        }
        if(scndMax == Integer.MIN_VALUE) return -1;
        return scndMax;
    }
}

