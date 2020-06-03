package 第1460题.通过翻转子数组使两个数组相等;

import java.util.Arrays;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/6/1 10:47<br/>
 *
 * @author zuo<br />
 * @since JDK 1.8
 */
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        boolean b = false;
        if (target.length != arr.length) {
            return false;
        }
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < target.length; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ta = {1,2,3,4};
        int[] ar = {2,4,1,3};
        boolean b = solution.canBeEqual(ta, ar);
        System.out.println(b);
    }
}