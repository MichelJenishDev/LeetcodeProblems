class Solution {
    int sum =0;
    boolean res = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
         TreeNode mainR = root;
         int sum =0;
         PS(root,targetSum,0,mainR);
         return res;
    }
    public void PS(TreeNode root,int target,int sum,TreeNode mainRoot){
         if(root == null) return ;
          sum+= root.val;
         if(sum == target && root.left==null && root.right==null){
             res = true;
             return;
         }
         
         PS(root.left,target,sum,mainRoot);
         PS(root.right,target,sum,mainRoot);
         if(root == mainRoot){
            sum = 0;
         }
        
    }
}