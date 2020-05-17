package log;

/**
 * 面试题29. 顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 * */
public class SpiralOrder_29 {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{};
        }

        int row1 = 0, row2 = matrix.length - 1 , col1 = 0 , col2 = matrix[0].length - 1,index = 0;
        int res[] = new int[matrix.length * matrix[0].length];
        while (row1 <= row2  && col1 <= col2) {
            for (int i = col1;i <= col2; i++) {
                res[index++] = matrix[row1][i];
            }
            for (int i = row1 + 1;i <= row2; i++) {
                res[index++] = matrix[i][col2];
            }
            if (row1 < row2 && col1 < col2) {
                for (int i = col2 - 1; i >= col1; i--)
                    res[index++] = matrix[row2][i];
                for (int i = row2 - 1;i >= row1 + 1; i--)
                    res[index++] = matrix[i][col1];
            }

            row1++;row2--;col1++;col2--;
        }

        return res;
    }

    public static void main(String[] args) {
        SpiralOrder_29 spiralOrder_29 = new SpiralOrder_29();
        System.out.println(spiralOrder_29.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }

}
