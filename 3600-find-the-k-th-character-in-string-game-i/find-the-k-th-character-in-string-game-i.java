class Solution {
    public char kthCharacter(int k) {
        return foundChar(k,"a");
    }
    char foundChar(int k,String s){
        if(s.length()>=k){
            return s.charAt(k-1);
        }
        String newString="";
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            ++temp;
            newString+=temp;

        }
        s+=newString;
        return foundChar(k,s);
    } 

}