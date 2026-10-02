class Solution {
    List<List<Integer>> path = new ArrayList<>();
    int sum =0;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> res = new ArrayList<>();
        PS(root,targetSum,res);
        return path;
    }
    public void PS(TreeNode root,int TS,List<Integer> res){
         if(root == null) return;
         sum+= root.val;
         res.add(root.val);
         if( sum == TS && root.left==null && root.right==null){
             path.add(new ArrayList<>(res));
             return;
         }
         //saving the current path
         int copy = sum;
         List<Integer> cpy = new ArrayList<>(res);
         PS(root.left,TS,res);
         //reset the path after exploring the left node and moving to the right part
         sum = copy;
         res = new ArrayList<>(cpy);
         PS(root.right,TS,res);
         //final reset to avoid the miscoliding of the data as Arraylist is a Wrapper class;
         sum = copy;
         res = new ArrayList<>(cpy);
    }
}