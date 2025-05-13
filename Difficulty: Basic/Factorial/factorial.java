//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.factorial(N));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static int factorial(int n) {
        // code here
        return calc(n);
    }
    static int calc(int n){
        if(n==0){
            return 1;
        }
        return n*calc(n-1);
    }
}