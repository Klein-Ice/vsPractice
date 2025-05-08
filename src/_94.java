import java.util.List;
import java.util.*;

import util.TreeNode;

public class _94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res= new ArrayList<>();
        inorder(root,res);
        return res;
    }

    private void inorder(TreeNode root,List res){
        if(root!=null){
            inorder(root.left,res);
            res.add(root.val);
            inorder(root.right,res);
        }
    }
}
