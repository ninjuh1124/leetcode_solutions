class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        return rangeSumBST(root, L, R, 0);
    }
    
    private int rangeSumBST(TreeNode node, int L, int R, int sum) {
        int toAdd = 0;
        
        if (node.val >= L && node.val <= R) {
            toAdd += node.val;
        }
        
        if (node.left != null
            && node.val >= L) toAdd += rangeSumBST(node.left, L, R, sum);
        if (node.right != null
            && node.val <= R) toAdd += rangeSumBST(node.right, L, R, sum);
        
        return sum + toAdd;
    }
}
