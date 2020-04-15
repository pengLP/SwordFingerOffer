/**
 * 面试题10- I. 斐波那契数列
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
 * */
public class Fib_10_1 {

    public int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int a = 0 , b = 1, res = 0;
        for (int i = 2;i <= n; i++) {
            res = (a+b) % 1000000007;
            a = b;
            b = res;

        }
        return res;
    }

    public static void main(String[] args) {
        Fib_10_1 fib_10_1 = new Fib_10_1();
        System.out.println(fib_10_1.fib(45));
    }
}
