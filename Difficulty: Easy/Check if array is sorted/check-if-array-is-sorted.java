class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        int j = 1;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] > arr[j])
             return false;
            j++;
        }
        return true;
    }
}