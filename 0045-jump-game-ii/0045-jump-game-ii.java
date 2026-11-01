class Solution {
    public int jump(int[] nums) {
        int curr =0;
        int path =0;
        int jump =0;
        for(int i=0;i<nums.length-1;i++){
             jump = Math.max(jump,i + nums[i]);
             if(i==path){
                 curr++;
                 path = jump;
             }
             if(path > nums.length-1) break;
        }
        return curr;
    }
}