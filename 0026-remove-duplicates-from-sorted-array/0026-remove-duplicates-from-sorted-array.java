class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
       for(int i=0;i<nums.length;i++){
           int count = 0;
           for(int j=i+1;j<nums.length;j++){
              if(nums[j]==nums[i]) count++;
           }
           if(count < 1) nums[k++] = nums[i];
       }
       return k;
    }
}