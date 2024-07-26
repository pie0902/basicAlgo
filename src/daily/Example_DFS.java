package daily;

import javax.swing.tree.TreeNode;

public class Example_DFS {
    static int idx = 0;
    static int answer = 0;
    static int cnt = 0;

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    public static void dfs(TreeNode treeNode) {
        if(treeNode == null){
            return;
        }
        idx++;
        dfs(treeNode.left);
        dfs(treeNode.right);
        if(treeNode.left == null && treeNode.right == null){
            cnt++;
            System.out.println("리프");
            answer = answer + idx;
            System.out.println("값: " +answer);
            if(cnt%2==0) {
                if(answer/2<=3){
                    System.out.println("정답~" + cnt);
                }
            }
        }
        idx--;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);


        dfs(root);
    }

}
