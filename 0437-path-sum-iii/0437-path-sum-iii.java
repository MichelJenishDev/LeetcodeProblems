class Solution {
    int count =0;
    public int pathSum(TreeNode root, int targetSum) {
        count =0;
        long sum =0;
        dfs(root,targetSum,sum);
        return count;
    }
    public void dfs(TreeNode root,int ts,long sum){
        if(root == null) return;
        path(root,ts,sum);
        dfs(root.left,ts,sum);
        dfs(root.right,ts,sum);
    }
    public void path(TreeNode root,int ts,long sum){
         if(root == null) return;
         sum+= root.val;
         if(sum == ts) count++;
         path(root.left,ts,sum);
         path(root.right,ts,sum);
    }
}