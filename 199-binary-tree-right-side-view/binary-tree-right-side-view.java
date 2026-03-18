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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        rightview(root,res,0);
        return res;

        
    }
    public void rightview(TreeNode cur,List<Integer> res,int curdep){
        if(cur==null){
            return;
        }
        if(curdep==res.size()){
            res.add(cur.val);

        }
        rightview(cur.right,res,curdep+1);
        rightview(cur.left,res,curdep+1);
    }
}