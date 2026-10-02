class Solution {
    public int sumNumbers(TreeNode root) {
        return RSum(root,0);
    }
    public int RSum(TreeNode root,int sum){
         if(root == null) return 0;
         sum = sum*10 + root.val;
         if(root.left==null && root.right ==null){
             return sum;
         }
         int l = RSum(root.left,sum);
         int r = RSum(root.right,sum);
         return l + r;
    }
}