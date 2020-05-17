package log;

import java.util.HashSet;
import java.util.Set;

/**
 * 面试题03. 数组中重复的数字
 * 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * \数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * */
public class FindRepeatNumber_03 {

    public int findRepeatNumber1(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0;i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            }else {
                set.add(nums[i]);
            }
        }
        return -1;
    }

    public int findRepeatNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        for (int i = 0;i < nums.length; i++) {
            while (nums[i] != i) {
                int tmp = nums[i];
                if (tmp == nums[tmp]) return tmp;
                nums[i] = nums[tmp];
                nums[tmp] = tmp;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FindRepeatNumber_03 findRepeatNumber_03 = new FindRepeatNumber_03();
        System.out.println(findRepeatNumber_03.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5}));
    }
}
