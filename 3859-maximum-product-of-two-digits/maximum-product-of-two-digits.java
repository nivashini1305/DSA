class Solution {
    public int maxProduct(int n) {
        String s=Integer.toString(n);
        int max=0;
        for(int i=0;i<=s.length();i++)
        {
             System.out.println("d");
            for(int j=i+1;j<s.length();j++)
            {
             System.out.println("d");

                int n1=Integer.parseInt(s.substring(i,i+1));
                int n2=Integer.parseInt(s.substring(j,j+1));
                 System.out.println(n1+" "+n2);
                int multi=n1*n2;
                System.out.println(multi);
                max=Integer.max(max,multi);
            }
        }
        return max;
    }
}