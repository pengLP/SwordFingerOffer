package log;

/**
 * 面试题12. 矩阵中的路径
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。
 * 如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。
 * 例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。
 * */
public class Exist_12 {

    public boolean exist(char[][] board, String word) {
        char c[] = word.toCharArray();
        for (int i = 0;i < board.length; i++) {
            for (int j = 0;j < board[i].length; j++) {
                if (bfs(board , i , j , c , 0))
                    return true;
            }
        }
        return true;
    }

    private boolean bfs(char[][] board , int x , int y , char c[] , int k) {
        if (x >= board.length || x < 0 || y >= board[0].length || y < 0 || board[x][y] != c[k]){
            return false;
        }
        if (k == c.length - 1)
            return true;
        char tmp = board[x][y];
        board[x][y] = '/';
        boolean res = bfs(board , x + 1 , y ,c , k +1) || bfs(board , x , y  + 1,c , k +1)
                || bfs(board , x - 1 , y ,c , k +1) || bfs(board , x  , y - 1,c , k +1);
        board[x][y] = tmp;
        return res;
    }

}
