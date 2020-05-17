package log;

import java.util.Arrays;


/**
 * 面试题07. 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * */
public class BuildTree_07 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0)
            return null;
        TreeNode treeNode = new TreeNode(preorder[0]);
        int index = getNums(treeNode.val , inorder);
        treeNode.left = buildTree(Arrays.copyOfRange(preorder , 1 , index + 1) ,
                Arrays.copyOfRange(inorder , 0 , index));
        treeNode.right = buildTree(Arrays.copyOfRange(preorder , index + 1 , preorder.length) ,
                Arrays.copyOfRange(inorder , index+1 , inorder.length));
        return treeNode;
    }

    private int getNums(int target , int[] inroder) {
        for (int i = 0;i < inroder.length; i++) {
            if (target == inroder[i])
                return i;
        }
        return -1;
    }



}
