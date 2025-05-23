class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        for(int ele:set)
        {
            if(!set.contains(ele-1))
            {
              int count=1;
              int num=ele;
              while(set.contains(num+1))
              {
                  count++;
                  num+=1;
              }
              max=Math.max(max,count);
            }
        }
        return max;
    }
}