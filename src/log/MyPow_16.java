package log;

/**
 * 面试题16. 数值的整数次方
 * 实现函数double Power(double base, int exponent)，求base的exponent次方。
 * 不得使用库函数，同时不需要考虑大数问题。
 * */
public class MyPow_16 {

    public double myPow(double x, long n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        if (n > 0)
            return help(x , n);
        else
            return help(1/x , -n);
    }

    private double help (double a , long b) {
        if (b == 1)
            return a;
        if (b % 2 == 1) {
            return a * help(a , b -1 );
        }else {
            return help(a * a , b >> 1);
        }
    }

}
