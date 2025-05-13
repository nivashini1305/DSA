//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printNos(N);
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {

   public void printNos(int n) {
        // Your code here
        print(1,n);
    }
    public void print(int count,int n){
        if(count==n+1){
            return;
        }
        print(count+1,n);
        System.out.print(count+" ");
        
    }
}