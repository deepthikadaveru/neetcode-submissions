class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] out=new int[nums.length];
        Arrays.fill(out,1);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    out[j]*=nums[i];
                }
            }
        }
        return out;
    }
}  
