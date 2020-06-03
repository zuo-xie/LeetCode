package 面试题58_2.左旋转字符;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/6/3 9:08<br/>
 *
 * @author zuo<br />
 * @since JDK 1.8
 */
public class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuffer sb = new StringBuffer(s);
        char[] chars = new char[n];
        for (int i = 0;i < n; i++) {
            char c = sb.charAt(i);
            chars[i] = c;
        }
        sb.delete(0,n);
        sb.append(chars);
        String s1 = new String(sb);
        return s1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String abcdefg = solution.reverseLeftWords("abcdefg", 2);
        System.out.println(abcdefg);
    }
}