import util.TreeNode;

public class _226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        // swapNode(root.left, root.right);
        invertTree(root.left);
        invertTree(root.right);

        return root;

    }

    private void swapNode(TreeNode left, TreeNode right) {
        TreeNode temp = right;
        right = left;
        left = temp;
    }
    
}
