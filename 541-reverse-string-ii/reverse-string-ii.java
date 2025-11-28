class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        if(k>n) 
        {
            
            sb = new StringBuilder(s);
            sb.reverse();
            return sb.toString();
        }
        for(int i=0;i<n;i+=2*k)
        {
            if(i+k < n && i+2*k <= n)
            {
                String s1 = s.substring(i,i+k);
                String s2 = s.substring(i+k,i+2*k);
                StringBuilder sb1 = new StringBuilder(s1);
                sb1.reverse();
                sb.append(sb1);
                sb.append(s2);
            }
            else if(i+k < n && i+2*k > n)
            {
                String s1 = s.substring(i,i+k);
                StringBuilder sb1 = new StringBuilder(s1);
                sb1.reverse();
                sb.append(sb1);
                sb.append(s.substring(i + k));
            }
           else {
                String rem = s.substring(i);
                System.out.println(rem);
                sb.append(new StringBuilder(rem).reverse());
            }
        }
        return sb.toString();

    }
}