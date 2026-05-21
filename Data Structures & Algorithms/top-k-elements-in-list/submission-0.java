class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        int[] ans=new int[k];
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        for(int i=0;i<k;i++){
            int mn=0,mf=0;
            for(int num:m.keySet()){
                if(m.get(num)>mf){
                    mf=m.get(num);
                    mn=num;
                }
            }
            ans[i]=mn;
            m.remove(mn);
        }
        return ans;
    }
}
