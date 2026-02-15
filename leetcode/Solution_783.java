package pdpuz;

public class Solution_783 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        Solution_783 solution783 = new Solution_783();

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println(solution783.minDiffInBST(root));

    }

    TreeNode prev;
    int res;

    public int minDiffInBST(TreeNode root) {
        prev = null;
        res = Integer.MAX_VALUE;
        inOrder(root);
        return res;
    }

    public void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        if (prev != null) res = Math.min(res, node.val - prev.val);
        prev = node;
        inOrder(node.right);
    }

}
