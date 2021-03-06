package log;

/**
 * 面试题26. 树的子结构
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 * */
public class IsSubStructure_26 {


    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null)
            return false;
        return dfs(A,B) || dfs(A.left , B) || dfs(A.right , B);
    }

    private boolean dfs(TreeNode A, TreeNode B) {
        if (B == null)
            return true;
        if (A == null)
            return false;
        if (A.val != B.val)
            return false;
        return dfs(A.left , B.left) && dfs(A.right , B.right);
    }

}
