class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<((long)m*(long)k))
        {
            return -1;
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++)
        {
            min=Math.min(bloomDay[i],min);
            max=Math.max(bloomDay[i],max);
        }
        int low=min;
        int high=max;
        while(low<=high)
        {
            int mid=(low+high)/2;
            boolean ans= blooms(bloomDay,mid, k, m);
            if(ans==true)
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
    boolean blooms(int[] arr,int days,int n,int m)
        {
            int count=0;
            int boq=0;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]<=days)
                {
                    count+=1;
                }
                else
                {
                    boq+=(count/n);
                    count=0;
                }
            }
            boq+=(count/n);
            if(boq>=m)
            {
                return true;
            }
            return false;
        }
}