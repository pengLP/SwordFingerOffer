

/**
 * 面试题03. 数组中重复的数字
 * 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 * */
public class FindRepeatNumber_3 {

    public int findRepeatNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        for (int i = 0;i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]])
                    return nums[i];
                int k = nums[i];
                nums[i] = nums[k];
                nums[k] = k;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        FindRepeatNumber_3 findRepeatNumber_3 = new FindRepeatNumber_3();
        System.out.println(findRepeatNumber_3.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }

}
