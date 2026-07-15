class Solution {
    public int[] runningSum(int[] nums) {
        int [] run_sum= new int[nums.length];
        run_sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            run_sum[i]=run_sum[i-1]+nums[i];
        }
        return run_sum;
    }
}
