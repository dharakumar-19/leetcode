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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List <List<Integer>> res=new ArrayList<>();

         if(root==null){
            return res ;
        }
        Queue <TreeNode> qu =new LinkedList<>();
        qu.add(root); 
        while(!qu.isEmpty()){
            int size=qu.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<size;i++){
            TreeNode cur=qu.poll();
            temp.add(cur.val);
            if(cur.left!=null){
                qu.add(cur.left);
            }
            if(cur.right!=null){
                qu.add(cur.right);
            }
            

        }res.add (0,temp);

    
        
    }
     return res;
}
}