class Solution {
    List<String> path = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        BTP(root,"");
        return path;
    }
    public void BTP(TreeNode root,String s){
         if(root == null) return;
         s+= String.valueOf(root.val)+"->";
         if(root.left == null && root.right == null){
             s = s.substring(0,s.length()-2);
             path.add(s);
             return;
         }
         String copy = s;
         BTP(root.left,s);
         s = copy;
         BTP(root.right,s);
    }
}