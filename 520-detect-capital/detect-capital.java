class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1) return true;
        char[] ch = word.toCharArray();
        boolean check = true;
        for(char c:ch)
        {
            if(!Character.isUpperCase(c))
            {
                check = false;
                break;
            }
        }
        if(check) return true;
        
        if(Character.isUpperCase(ch[0]) || Character.isLowerCase(ch[0]))
        {
            check = true;
            for(int i=1;i<ch.length;i++)
            {
                if(Character.isUpperCase(ch[i])) 
                {
                    check = false;
                    break;

                }
            }
        }
            System.out.println(check);

        if(!check) return false;

        return true;
    }
}