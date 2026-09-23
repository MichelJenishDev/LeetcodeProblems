class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        PostOrder(root,res);
        return res;
    }
    public void PostOrder(TreeNode root,List<Integer> res){
          if(root == null) return;
           PostOrder(root.left,res);
           PostOrder(root.right,res);
           res.add(root.val);
    }
}