class Solution {
    public int minDepth(TreeNode root) {
        if(root ==null) return 0;
        int l = minDepth(root.left);
        int r = minDepth(root.right); //calculating the right height
        if(root.left==null && root.right==null) return 1; 
        if(root.left==null) return 1+r;
        if(root.right==null) return 1 +l;
        return 1 + Math.min(l,r);
    }
}