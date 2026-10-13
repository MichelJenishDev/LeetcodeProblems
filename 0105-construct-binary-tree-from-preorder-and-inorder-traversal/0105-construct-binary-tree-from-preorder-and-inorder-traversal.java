class Solution {
    int preindx =0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preindx =0;
        return helper(preorder,inorder,0,inorder.length-1);
    }
    int search(int [] inorder,int val, int l,int r){
        for(int i=l;i<=r;i++){
            if(inorder[i]==val) return i;
        }
        return-1;
    }
    TreeNode helper(int[] preorder,int[] inorder,int l,int r){
        if(l > r) return null;
        int val = preorder[preindx];
        TreeNode root = new TreeNode(preorder[preindx]);
        int pos = search(inorder,root.val,l,r);
        preindx++;
        root.left = helper(preorder,inorder,l,pos-1);
        root.right = helper(preorder,inorder,pos+1,r);
        return root;

    }
}