class Solution {
    public static int largest(int[] arr) {
        // code here
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            max = Math.max(arr[i],max);
        }
        return max;
    }
}
