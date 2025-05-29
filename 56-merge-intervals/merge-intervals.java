class Solution {
    public int[][] merge(int[][] intervals) {
        Comparator<int[]> obj = new Comparator<>(){
            public int compare(int o1[],int o2[])
            {
                int diff=Integer.compare(o1[0],o2[0]);
                return diff;
            }
        };
        Arrays.sort(intervals,obj);
        int[][] ans = new int[intervals.length][2];
        int index=0;
        for(int i=0;i<intervals.length;i++)
        {
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(index==0 || ans[index-1][1]<intervals[i][0])
            {
                ans[index][0]=start;
                ans[index][1]=end;
                index++;
            }
            else
            {
                ans[index-1][1]=Math.max(ans[index-1][1],end);
            }
        }
         return Arrays.copyOf(ans,index);
    }
}