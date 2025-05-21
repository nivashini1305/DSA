// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> hashMap= new HashMap<>();
        int sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==k)
            {
                max=Math.max(max,i+1);
            }
            if(hashMap.containsKey(sum-k))
            {
                max=Math.max(max,i-hashMap.get(sum-k));
            }
            if(!hashMap.containsKey(sum))
            {
                hashMap.put(sum,i);
            }
        }
        return max;
    }
}
