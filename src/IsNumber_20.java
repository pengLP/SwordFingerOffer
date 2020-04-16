
/**
 * 面试题20. 表示数值的字符串
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100"、"5e2"、"-123"、"3.1416"、"0123"及"-1E-16"都表示数值，
 * 但"12e"、"1a3.14"、"1.2.3"、"+-5"及"12e+5.4"都不是。
 * */
public class IsNumber_20 {

    public boolean isNumber(String s) {
        if (s == null) return false;

        char str[] = s.trim().toCharArray();

        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;

        for (int i = 0;i < str.length; i++) {

            if (str[i] >= '0' && str[i] <= '9') {
                numSeen = true;
            }else if (str[i] == '.') {
                if (dotSeen || eSeen)
                    return false;
                dotSeen = true;
            }else if (str[i] == 'e' || str[i] == 'E'){
                if (!numSeen || eSeen)
                    return false;
                eSeen = true;
                numSeen = false;
            }else if (str[i] == '+' || str[i] == '-') {
                if (i != 0 && str[i - 1] != 'e' && str[i - 1] != 'E' ) {
                    return false;
                }
            }else {
                return false;
            }
        }
        return numSeen;

    }

}
