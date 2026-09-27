class Solution {
    public boolean isBalanced(TreeNode root) {
       if(root == null) return true;
       boolean l = isBalanced(root.left);
       boolean r = isBalanced(root.right);
       // the core of the problem
       int left = heightBal(root.left); // the left height 
       int right = heightBal(root.right); // the right height;
       if(Math.abs(left - right)<=1) return l&&r;
       return false;
    }
    public int heightBal(TreeNode root){
        if(root == null) return 0;
        int left = heightBal(root.left);
        int right = heightBal(root.right);
        return 1 + Math.max(left,right);
    }
}