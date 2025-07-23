class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        TreeSet<Integer> tree = new TreeSet(set);
        int j=0;
        for(int i:tree)
        {
            nums[j]=i;
            j++;
        }
        return set.size();
    }
}