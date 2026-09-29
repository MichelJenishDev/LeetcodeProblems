class Solution {
    int sum=0;
    public int diameterOfBinaryTree(TreeNode root) {
        int height = dm(root);
        return sum;
    }
    public int dm(TreeNode root){
        if(root == null) return 0;
        int left =dm(root.left);
        int right =dm(root.right);
        sum = Math.max(sum,left + right);
        return 1 + Math.max(left,right);
    }
}