// User function Template for Java

class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        return mergeSort(arr,0,arr.length-1);
        
    }
    static int mergeSort(int arr[], int l, int r) {
        // code here
        int count=0;
        if(l==r){
            return count;
        }
        int mid=(l+r)/2;
        count+=mergeSort(arr,l,mid);
        count+=mergeSort(arr,mid+1,r);
        count+=merge(arr,mid,l,r);
        return count;
    }
    static int merge(int arr[],int mid,int l,int r){
        int count =0;
        List<Integer> temp = new ArrayList<>();
        int left=l;
        int right=mid+1;
        
        while(left<=mid && right<=r){
            if(arr[left]>arr[right]){
                temp.add(arr[right]);
                count+=mid-left+1;
                right++;
            }
            else{
                temp.add(arr[left]);
                left++;
            }
    }
    while(left<=mid){
        temp.add(arr[left]);
        left++;
    }
    while(right<=r){
        temp.add(arr[right]);
        right++;
    }
    for(int i=l;i<=r;i++){
        arr[i]=temp.get(i-l);
    }
    return count;
}
}
