class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<ans.length;i++){
            int count= small(nums[i],nums);
            ans[i]=count;
        }
        return ans;
    }
    public int small(int x,int[] nums){
        int c=0;
         for(int n : nums){
            if( x > n ) c++;
         }
         return c;
    }
}