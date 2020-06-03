package 面试题56题.数组中数字出现的次数;

class Solution {
    public int[] singleNumbers(int[] nums) {
        int m = 0;
        //使用异或来得到最后的数据
        for (int num : nums) {
            m ^= num;
        }
        int mask = 1;
        while ((m & mask) == 0) {
            mask <<= 1;
        }
        int a = 0;
        int b = 0;

        for (int num : nums) {
            if ((num & mask) == 0) {
                a ^= mask;
            } else {
                b ^= mask;
            }
        }
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 3, 4, 3};

        int[] ints = solution.singleNumbers(nums);
        System.out.println(ints);
    }
}
