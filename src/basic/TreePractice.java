package basic;


public class TreePractice {

    static TreeNode root = null;

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void in(int val) {
        root = insertv(root, val);
    }

    public static TreeNode insertv(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        if (val < root.val) {
            root.left = insertv(root.left, val);
            System.out.println("왼쪽" + root.left.val);
        } else if (val > root.val) {
            root.right = insertv(root.right, val);
            System.out.println("오른쪽" + root.right.val);
        }
        System.out.println(root.val);
        return root;
    }

    public static void main(String[] args) {
        int[] ary = {10, 5, 15, 3, 7, 18};
        for (int i : ary) {
            in(i);
        }
        System.out.println("중위 순회 출력:");
        inorderTraversal(root);
    }
    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }
}
