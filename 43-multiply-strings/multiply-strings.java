import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        BigInteger total = BigInteger.ZERO;
        int mul = 0;
        for(int i=num2.length()-1;i>=0;i--)
        {
            int n1 = num2.charAt(i) - '0';
            int carry = 0;
            StringBuilder sb = new StringBuilder();
            for(int j=num1.length()-1;j>=0;j--)
            {
                int n2 = num1.charAt(j) - '0';
                mul = n2 * n1 + carry;
                carry = mul/10;
                sb.append(mul%10);
            }
            if(carry != 0)
            {
                sb.append(carry);
            }
            sb.reverse();

            for(int k=0;k<num2.length()-1-i;k++)
            {
                sb.append(0);
            }

            total = total.add(new BigInteger(sb.toString()));
        }

        return total.toString();

        }
    }
