class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return String.valueOf(num);
        int number = num;
        StringBuilder sb = new StringBuilder();
        if(num<0) num = Math.abs(num);
        while(num > 0)
        {
            int n = num % 7;
            sb.append(n);
            num = num/7;
        }
        if(number < 0) sb.append("-");
        sb.reverse();
        return sb.toString();
    }
}