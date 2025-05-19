//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.maxConsecutiveCount(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public int maxConsecutiveCount(int[] arr) {
        // code here
        int count1=1;
        int count0=1;
        int max=Integer.MIN_VALUE;
        if(arr.length==1){
            return 1;
        }
        for(int i=0;i<arr.length-1;i++){
        if(arr[i]==arr[i+1]){
             if(arr[i]==1){
                count1+=1;
                // System.out.println("count1: "+count1);
            }
            else if(arr[i]==0){
                count0+=1;
                // System.out.println("count0: "+count0);
            }   
            }
            else{
                count1=1;
                count0=1;
            }
            max=Math.max(max,count0);
            max=Math.max(max,count1);
            // System.out.println("max: "+max);
        }
        return max;
    }
}
