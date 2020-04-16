
/**
 * 面试题13. 机器人的运动范围
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。
 * 一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），
 * 也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，
 * 因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 * */
public class MovingCount_13 {

    public int movingCount(int m, int n, int k) {
        int matrix[][] = new int[m][n];
        boolean visit[][] = new boolean[m][n];
        return dfs(0 ,0 , visit , matrix , k);


    }

    private int dfs(int x , int y , boolean visit[][],int matrix[][], int k) {
        if (check(x , y , visit , matrix , k)) {
            visit[x][y] = true;
            return 1 + dfs(x + 1, y, visit, matrix, k) + dfs(x, y + 1, visit, matrix, k);
        }
        return 0;
    }


    public boolean check(int x,int y,boolean visit[][] ,int matrix[][] , int k) {
        if (x >= 0 && y >= 0 && x < matrix.length && y < matrix[0].length && !visit[x][y] && (getSum(x)+getSum(y) <= k)) {
            return true;
        }
        return false;
    }

    public int getSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

}
