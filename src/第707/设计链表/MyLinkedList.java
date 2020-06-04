package 第707.设计链表;

/**
 * 未完成
 * Description: <br/>
 * date: 2020/6/3 9:37<br/>
 *
 * @author zuo<br />
 * @since JDK 1.8
 */
class MyLinkedList {

    //值
    private int val;
    //节点
    private MyLinkedList next;
    //长度
    private int size;
    /** Initialize your data structure here. */
    public MyLinkedList() {

    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index > size ) {
            return -1;
        }
        MyLinkedList myLinkedList = next;
        for (int i = 0;i < index; i++) {
            myLinkedList = next.next;
        }
        return myLinkedList.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        MyLinkedList myLinkedList = next;
        int i = this.val;

        this.val = val;
        this.next = myLinkedList;

        next.val = i;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        //空链表如何处理
        if (size == 0) {
            this.val = val;
            this.next = null;
        } else {

        }
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */