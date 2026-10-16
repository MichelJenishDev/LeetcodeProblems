class Solution {
    int maxSum =Integer.MIN_VALUE;
     public int maxPathSum(TreeNode root) {
         pathsum(root);
         return maxSum;
    }
    int pathsum(TreeNode root){
        if(root == null) return 0;
        int l = pathsum(root.left);
        int r = pathsum(root.right);
        maxSum = Math.max(maxSum, Math.max(l,0)+Math.max(r,0)+root.val);
        return root.val + Math.max(Math.max(l,r),0);
    }
}