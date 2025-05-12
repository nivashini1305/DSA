//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        int number=n;
        int count = 0;
        while(number>0)
        {
            int singleDigit=number%10;
            number=number/10;
            if(singleDigit==0) continue;
            if(n%singleDigit==0){
                count+=1;   
            }
        }
        return count;
    }
}