class Solution {
    public TreeNode invertTree(TreeNode root) {
         if(root == null) return null;
         TreeNode curr = root;
         TreeNode left = invertTree(root.left);
         TreeNode right = invertTree(root.right);
         // the swapping part
         TreeNode temp = left;
         curr.left = right;
         curr.right = left;
         return curr;
    }
}