class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length-1;
        if(n==0) return true;
        int jump = nums[0];
        if(jump == 0) return false;
        for(int i=1;i<=jump;i++){
             if(i+nums[i] >= n) return true;
              jump = Math.max(jump,i+nums[i]);
        }
        return false;
    }
}