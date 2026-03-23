class Solution {

    TreeNode delete(TreeNode root, int key){
        if(root == null){
            return null;
        }

        if(key < root.val){
            root.left = delete(root.left, key);
        }
        else if(key > root.val){
            root.right = delete(root.right, key);
        }
        else {
            
            if(root.left == null && root.right == null){
                return null;
            }

          
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }

            
            TreeNode temp = findMin(root.right);
            root.val = temp.val;
            root.right = delete(root.right, temp.val);
        }

        return root;
    }

    TreeNode findMin(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        return delete(root, key);
    }
}