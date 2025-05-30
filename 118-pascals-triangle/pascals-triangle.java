class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result= new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            List<Integer> row = row(i);
            result.add(row);
        }
        return result;
    }
    public List<Integer> row(int i)
    {
        int sum=1;
        List<Integer> arr=new ArrayList<>();
        arr.add(sum);
        for(int j=1;j<i;j++)
        {
            sum=sum*(i-j);
            sum=sum/j;
            arr.add(sum);
        }
        return arr;
    }
}