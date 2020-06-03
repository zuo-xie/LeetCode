package 面试题0203.删除中间节点;

import java.util.Map;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/6/3 9:28<br/>
 *
 * @author zuo<br />
 * @since JDK 1.8
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}