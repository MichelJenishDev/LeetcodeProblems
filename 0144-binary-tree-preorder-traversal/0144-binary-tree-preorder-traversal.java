class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root,res);
        return res;
    }
     public static void preorder(TreeNode root,List<Integer> res){
         if(root==null) return;
          res.add(root.val);
         preorder(root.left,res);
         preorder(root.right,res);
    }
}