class Solution {
    int indx =0;
    int search(int [] inorder,int val,int l,int r){
        for(int i=l;i<=r;i++){
             if(inorder[i]==val) return i;
        }
        return -1;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        indx =postorder.length-1;
         return helper(inorder,postorder,0,inorder.length-1);
    }
    TreeNode helper(int[] inorder, int[] postorder,int l,int r){
        if(r < l) return null;
        TreeNode root = new TreeNode(postorder[indx]);
        int pos = search(inorder,postorder[indx],l,r);
        indx--;
        root.right = helper(inorder,postorder,pos+1,r);
        root.left = helper(inorder,postorder,l,pos-1);
        return root;
    }
}