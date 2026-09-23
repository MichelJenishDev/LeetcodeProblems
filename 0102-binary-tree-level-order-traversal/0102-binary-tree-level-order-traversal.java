class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        level(root, res);

        return res;
    }

    public void level(TreeNode root, List<List<Integer>> res) {

        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> level = new ArrayList<>();

        q.offer(root);
        q.offer(null);

        while (!q.isEmpty()) {

            TreeNode curr = q.poll();

            // End of current level
            if (curr == null) {

                res.add(level);

                // Start a new level
                level = new ArrayList<>();

                if (!q.isEmpty()) {
                    q.offer(null);
                }

                continue;
            }

            // Add current node to current level
            level.add(curr.val);

            // Add children of CURRENT node
            if (curr.left != null) {
                q.offer(curr.left);
            }

            if (curr.right != null) {
                q.offer(curr.right);
            }
        }
    }
}