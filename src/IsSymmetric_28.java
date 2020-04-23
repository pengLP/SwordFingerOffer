/**
 * 面试题28. 对称的二叉树
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 * */
public class IsSymmetric_28 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return dfs(root , root);
    }

    private boolean dfs(TreeNode root1 , TreeNode root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        if (root1.val != root2.val)
            return false;
        return dfs(root1.left , root2.right) && dfs(root1.right , root2.left);
    }


}
