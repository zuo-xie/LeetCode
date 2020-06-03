package 第1431题.拥有最多糖果的孩子;

import java.util.ArrayList;
import java.util.List;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/6/1 10:02<br/>
 *
 * @author zuo<br />
 * @since JDK 1.8
 */
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        int i;
        for (i = 0;i < candies.length; i++) {
            if (candies[i] > max) {
                 max = candies[i];
            }
        }
        for (i = 0;i< candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(Boolean.FALSE);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candies =  {2,3,5,1,3};
        List<Boolean> list = solution.kidsWithCandies(candies, 3);
        System.out.println(list);
    }
}