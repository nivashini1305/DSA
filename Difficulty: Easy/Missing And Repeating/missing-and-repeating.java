// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        long n=arr.length;
        long S=(n*(n+1))/2;
        long SN=(n*(n+1)*(2*n+1))/6;
        long s1=0;
        long s2=0;
        for(int i=0;i<n;i++)
        {
            s1+=(long)arr[i];
            s2+=(long)arr[i]*(long)arr[i];
        }
        long value1=s1-S;
        long value2=s2-SN;
        value2=value2/value1;
        long x=(value1+value2)/2;
        long y=x-value1;
        res.add((int)x);
        res.add((int)y);
        return res;
    }
}
