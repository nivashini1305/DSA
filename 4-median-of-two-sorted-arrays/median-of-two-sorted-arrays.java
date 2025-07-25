class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length)
        {
            return findMedianSortedArrays(nums2,nums1);
        }
        int n=(nums1.length+nums2.length);
        int left=(n+1)/2;
        int low=0;
        int high=nums1.length;
        while(low<=high)
        {
            int mid1=(low+high)/2;
            int mid2=left-mid1;
            int l1=Integer.MIN_VALUE;
            int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE;
            int r2=Integer.MAX_VALUE;
            if(mid1<nums1.length)
                r1=nums1[mid1];
            if(mid2<nums2.length)
                r2=nums2[mid2];
            if(mid1-1>=0)
                l1=nums1[mid1-1];
            if(mid2-1>=0)
                l2=nums2[mid2-1];
            if(l1<=r2 && l2<=r1)
            {
                if((nums1.length+nums2.length)%2==1)
                {
                    return Math.max(l1,l2);
                }
                else
                {
                    return ((double)Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }
            }
            else if(l1>r2)
            {
                high=mid1-1;
            }
            else
            {
                low=mid1+1;
            }
        }
        return 0;
    }
}