class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m=new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(target-nums[i]) && m.get(target-nums[i])!=i){
                ans[0]=i<m.get(target-nums[i])?i:m.get(target-nums[i]);
                ans[1]=i>m.get(target-nums[i])?i:m.get(target-nums[i]);
            }
        }
        return ans;
    }
}
