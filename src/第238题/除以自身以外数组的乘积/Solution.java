package 第238题.除以自身以外数组的乘积;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/6/4 8:55<br/>
 *
 * @author zuo<br />
 * @since JDK 1.8
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int k = 1;
        for(int i = 0; i < res.length; i++){
            res[i] = k;
            k = k * nums[i];
        }
        k = 1;
        for(int i = res.length - 1; i >= 0; i--){
            res[i] *= k;
            k *= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] i = {1,2,3,4};
        int[] ints = s.productExceptSelf(i);
        System.out.println(ints);
    }
}