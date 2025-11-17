class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int p1 = 0;
        int p2 = arr.length-1;

        while(p1<=p2)
        {
            if((arr[p1] == 'a'||arr[p1] == 'e'||arr[p1] == 'i'||arr[p1] == 'o'||arr[p1] == 'u'||arr[p1] == 'A'||arr[p1] == 'E'||arr[p1] == 'I'||arr[p1] == 'O'||arr[p1] == 'U') && (arr[p2] == 'a'||arr[p2] == 'e'||arr[p2] == 'i'||arr[p2] == 'o'||arr[p2] == 'u'||arr[p2] == 'A'||arr[p2] == 'E'||arr[p2] == 'I'||arr[p2] == 'O'||arr[p2] == 'U'))
            {
                // System.out.println(arr[p1]+" "+arr[p2]);
                char temp = arr[p2];
                arr[p2] = arr[p1];
                arr[p1] = temp;
                p1++;
                p2--;
            }
        else if(arr[p1] == 'a'||arr[p1] == 'e'||arr[p1] == 'i'||arr[p1] == 'o'||arr[p1] == 'u'||arr[p1] == 'A'||arr[p1] == 'E'||arr[p1] == 'I'||arr[p1] == 'O'||arr[p1] == 'U' )
        {
            p2--;
        }
        else if( arr[p2] == 'a'||arr[p2] == 'e'||arr[p2] == 'i'||arr[p2] == 'o'||arr[p2] == 'u'||arr[p2] == 'A'||arr[p2] == 'E'||arr[p2] == 'I'||arr[p2] == 'O'||arr[p2] == 'U')
        {
            p1++;
        }
        else
        {
            p1++;
            p2--;
        }
    }
    StringBuilder sb = new StringBuilder();
    for(int i = 0;i<arr.length;i++)
    {
        sb.append(arr[i]);
    }
    return sb.toString();
}
}
