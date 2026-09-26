class Solution {
    public boolean isSymmetric(TreeNode root) {
        TreeNode p =root.left;
        TreeNode q = root.right;
        boolean res = isMirror(p,q);
        return res;
    }
    public boolean isMirror(TreeNode p,TreeNode q){
         if(p==null &&  q == null) return true;
        if(p==null || q==null || p.val!=q.val) return false;
        return isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }
}