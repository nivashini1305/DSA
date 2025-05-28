class Solution {
    int maxLen(int arr[]) {
        // code here
        int sum=0;
        int max=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==0)
            {
                max=i+1;
            }
            if(map.containsKey(sum))
            {
                max=Math.max(i-map.get(sum),max);
            }
            else{
                map.put(sum,i);
            }
        }
        return max;
    }
}