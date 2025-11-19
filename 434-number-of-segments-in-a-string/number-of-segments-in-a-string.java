class Solution {
    public int countSegments(String s) {
        s = s.strip();
        if(s.isEmpty()) return 0;
        String[] arr = s.split("\\s+");
        return arr.length;
    }
}