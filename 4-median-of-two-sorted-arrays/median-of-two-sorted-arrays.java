class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n2=(nums1.length+nums2.length)/2;
        int n1=n2-1;
        int ele1=-1;
        int ele2=-1;
        int count=0;
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                if(count==n1) ele1=nums1[i];
                if(count==n2) ele2=nums1[i];
                count++;
                i++;
            }
            else
            {
                if(count==n1) ele1=nums2[j];
                if(count==n2) ele2=nums2[j];
                count++;
                j++;
            }
        }
        while(i<nums1.length)
        {
                if(count==n1  ) ele1=nums1[i];
                if(count==n2) ele2=nums1[i];
                count++;
                i++;
        }
        while(j<nums2.length)
        {
                if(count==n1) ele1=nums2[j];
                if(count==n2) ele2=nums2[j];
                count++;
                j++;
        }
        if((nums1.length+nums2.length)%2==1)
        {
            return (double)ele2;
        }
        return (double)((double)ele1 + (double)ele2) /2.0;
    }
}