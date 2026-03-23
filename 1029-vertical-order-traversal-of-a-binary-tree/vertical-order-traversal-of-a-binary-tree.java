/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<int[]> list = new ArrayList<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        tree(root, 0, 0);

        Collections.sort(list, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0]; 
            if (a[1] != b[1]) return a[1] - b[1]; 
            return a[2] - b[2]; 
        });

        List<List<Integer>> res = new ArrayList<>();
        int prevCol = Integer.MIN_VALUE;

        for (int[] node : list) {
            if (node[0] != prevCol) {
                res.add(new ArrayList<>());
                prevCol = node[0];
            }
            res.get(res.size() - 1).add(node[2]);
        }

        return res;
    }

    void tree(TreeNode root, int col, int row) {
        if (root == null) return;

        list.add(new int[]{col, row, root.val});
        tree(root.left, col - 1, row + 1);
        tree(root.right, col + 1, row + 1);
    }
}