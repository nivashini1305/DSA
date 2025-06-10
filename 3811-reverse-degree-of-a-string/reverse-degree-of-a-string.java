class Solution {
    public int reverseDegree(String s) {
        char[] ch=s.toCharArray();
        int result=0;
        for(int i=0;i<s.length();i++)
        {
            int charac=0;
            charac=ch[i];
            int multi=(122-charac)+1; 
            System.out.println(multi);
            result+=(i+1)*multi;
            System.out.println(result);

        }
        return result;
    }
}