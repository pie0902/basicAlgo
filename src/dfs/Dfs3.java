package dfs;

import com.sun.source.tree.Tree;
import java.util.HashMap;
import java.util.Map;

public class Dfs3 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static TreeNode create(Integer[] nodes){
         return insert(nodes,0);
    }


    public static TreeNode insert(Integer[] ary,int i){
        if(i<ary.length&&ary[i] != null){
            TreeNode root = new TreeNode(ary[i]);
            root.left = insert(ary,2*i+1);
            root.right = insert(ary,2*i +2);
            return root;
        }
        return null;

    }
    public static void dfs(TreeNode tree,Map<Integer,Boolean> map){
        map.put(tree.val,true);
        System.out.println(tree.val);
        if(tree.left!=null){
            dfs(tree.left,map);
        }
        if(tree.right!=null){
            dfs(tree.right,map);
        }
    }

    public static void main(String[] args){
        Integer[] ary = {0,1,2,3,4,5};
        Map<Integer,Boolean> v = new HashMap<>();
        TreeNode root = create(ary);
        dfs(root,v);


    }

}
