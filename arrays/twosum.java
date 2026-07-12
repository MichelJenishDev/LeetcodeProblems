// this is a simple implementation of the two sum problem in Java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                 if(nums[i]+nums[j]==target) return new int[]{i,j};
            }
        }
        return new int[]{};
    }
}
// this the brute force solution with time complexity O(n^2) and space complexity O(1).