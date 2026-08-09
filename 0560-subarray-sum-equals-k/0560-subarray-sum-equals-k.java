class Solution {
    public int subarraySum(int[] nums, int k) {
        int l=0,r=0;
        int count=0;
        int window=0;
        int n=nums.length;
       for(int i=0;i<n;i++){
        int sum=0;
        for(int j=i;j<n;j++){
            sum = sum +nums[j];
            if ( sum == k ) count++;
        }
       }
        return count;
    }
}