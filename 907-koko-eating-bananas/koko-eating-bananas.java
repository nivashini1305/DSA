class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
        {
            maxi=Integer.max(piles[i],maxi);
        }
        int low=1;
        int high=maxi;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int time=func(piles,mid);
            if(time<=h)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
        int func(int[]arr,int hour)
        {
            int totalhour=0;
            for(int i=0;i<arr.length;i++)
            {
                totalhour+=Math.ceil((double)arr[i]/(double)hour);
            }
            return totalhour;
        }
}