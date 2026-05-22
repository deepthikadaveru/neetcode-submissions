class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int len=01;
        int ml=01;
        if(nums.length==0) return 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]==1) {
                len++;
            }
            else if(nums[i]-nums[i-1]==0) continue;
            else len=01;
            ml=Math.max(ml,len);
        }
        return ml;
    }
}
