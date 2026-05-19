class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] fa1=new int[26];
        int[] fa2=new int[26];
        for(int i=0;i<s.length();i++){
            fa1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            fa2[t.charAt(i)-'a']++;
        }
        boolean ans=true;
        for(int i=0;i<26;i++){
            if(fa1[i]!=fa2[i]) ans=false;
        }
        return ans;
    }
}
