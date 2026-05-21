class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        Map<String,List<String>> m=new HashMap<>();
        for(String s:strs){
            int[] ct=new int[26];
            for(char c:s.toCharArray()){
                ct[c-'a']++;
            }
            String k=Arrays.toString(ct);
            m.putIfAbsent(k,new ArrayList<>());
            m.get(k).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
