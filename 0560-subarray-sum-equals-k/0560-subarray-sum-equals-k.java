class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int presum=0,cnt=0;
        for(int x : nums){
            presum+= x;
            if(map.containsKey(presum-k)){
                cnt+= map.get(presum-k);
            }
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return cnt;
    }
}