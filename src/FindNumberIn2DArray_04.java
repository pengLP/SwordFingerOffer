import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 面试题04. 二维数组中的查找
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * */
public class FindNumberIn2DArray_04 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;
        int rows = matrix.length, cols = matrix[0].length - 1,
        row = 0;
        while (row < rows && cols >= 0) {
            if (target == matrix[rows][cols])
                return true;
            else if (target > matrix[row][cols])
                row++;
            else
                cols--;
        }

        Lock lock = new ReentrantLock();
        return false;
    }

}
