class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> res = new ArrayList<>();
        if(nums.length == 0) return res;
        int n1 = nums[0];
        int n2 = nums[0];

        for(int i=0;i<nums.length-1;i++)
        {
            int p1 = nums[i];
            int p2 = nums[i+1];
            
            if(Math.abs(p1-p2) != 1)
            {
                StringBuilder sb = new StringBuilder();
                if(n1 == n2) sb.append(n1);
                else
                {
                    sb.append(n1);
                    sb.append("->");
                    sb.append(n2);
                }
                n1 = nums[i+1];
                res.add(sb.toString());
            }
            n2 = p2;
        }
        if(n1 == n2) res.add(String.valueOf(n1));
        else
        {
            StringBuilder sb = new StringBuilder();
            sb.append(n1);
            sb.append("->");
            sb.append(n2);
            res.add(sb.toString());
        }
        return res;
    }
}