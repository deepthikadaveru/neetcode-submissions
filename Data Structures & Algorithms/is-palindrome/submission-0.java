class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        boolean ans=true;
        s=s.toLowerCase();
        while(i<j){
            if(((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z') ||   (s.charAt(i) >= '0' && s.charAt(i) <= '9')) &&
           ((s.charAt(j)>='A' && s.charAt(j)<='Z') || (s.charAt(j)>='a' && s.charAt(j)<='z') ||   (s.charAt(i) >= '0' && s.charAt(i) <= '9'))){
                if(s.charAt(i)==s.charAt(j)){
                    i++;
                    j--;
                }
                else {ans=false; break;}
            }
            else if(!((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z') ||   (s.charAt(i) >= '0' && s.charAt(i) <= '9')) ) i++;
            else if(!((s.charAt(j)>='A' && s.charAt(j)<='Z') || (s.charAt(j)>='a' && s.charAt(j)<='z') ||   (s.charAt(i) >= '0' && s.charAt(i) <= '9')) ) j--;
        }
        return ans;
    }
}
