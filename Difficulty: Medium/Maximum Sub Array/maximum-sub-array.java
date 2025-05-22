// User function Template for Java

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
        ArrayList<Integer> array = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int sum=0;
        int strt=-1;
        int end =-1;
        int strtAns=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                sum =0;
                continue;
            }
            if(sum==0)
            {
                strt=i;
            }
            sum+=arr[i];
            
            if(max<=sum)
            {
                max=sum;
                strtAns=strt;
                end=i;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        if(strtAns==-1 && end ==-1){
            return new ArrayList<>(Arrays.asList(-1));
        }
        for(int i=strtAns;i<=end;i++)
        {
            array.add(arr[i]);
        }
        return array;
        
    }
}