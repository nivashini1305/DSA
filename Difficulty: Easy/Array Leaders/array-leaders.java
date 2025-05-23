class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            boolean flag=false;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>=arr[j])
                {
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                array.add(arr[i]);
            }
        }
        array.add(arr[arr.length-1]);
        return array;
    }
}
