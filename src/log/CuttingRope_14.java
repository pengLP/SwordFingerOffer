package log;

import java.util.Map;

/**
 * 面试题14- I. 剪绳子
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为 k[0],k[1]...k[m] 。请问 k[0]*k[1]*...*k[m] 可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * */
public class CuttingRope_14 {

    public int cuttingRope1(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        int dp[] = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3;i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i] , Math.max((i - j) * j , dp[i- j] * j));
            }
        }
        return dp[n];
    }

    public int cuttingRope(int n) {
        long dp[] = new long[1001];
        dp[1]=1;
        dp[2]=1;
        dp[3]=2;
        dp[4]=4;
        dp[5]=6;
        dp[6]=9;
        for (int i = 7;i <= n;i ++) {
            dp[i] = (dp[i - 3] * 3) % 1000000007;
        }
        return (int)dp[n];
    }

}
