package 第5428题.重新排列数组;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/6/8 9:00<br/>
 *
 * @author zuo<br />
 * @since JDK 1.8
 */
public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ints = new int[nums.length];
        for (int i = 0;i < nums.length; i+=2) {
            ints[i] = nums[i];
            i++;
        }
        for (int i = 1;i < nums.length; i+=2) {
            ints[i] = nums[i];
            i++;
        }
        return ints;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] shuffle = s.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4);
        System.out.println(shuffle);
    }
}