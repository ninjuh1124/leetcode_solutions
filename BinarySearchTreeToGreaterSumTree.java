class Solution {
    public TreeNode bstToGst(TreeNode root) {
        return bstToGst(root, 0);
    }

    private TreeNode bstToGst(TreeNode root, int x) {
        // descend right tree
        if (root.right != null) bstToGst(root.right, x);
        
        // get right child's left-most leaf
        if (root.right != null) {
            TreeNode leftMost = root.right;
            while (leftMost.left != null) leftMost = leftMost.left;
            root.val += leftMost.val;
        } else root.val += x;
        
        // descend left tree
        if (root.left != null) bstToGst(root.left, root.val);
        
        return root;
    }
}
