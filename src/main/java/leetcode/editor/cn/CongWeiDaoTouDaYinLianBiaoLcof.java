//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
// Related Topics栈 | 递归 | 链表 | 双指针 
//
// 👍 304, 👎 0 
//
//
//
//


package leetcode.editor.cn;

import java.util.Arrays;

public class CongWeiDaoTouDaYinLianBiaoLcof {
    public static void main(String[] args) {
        Solution solution = new CongWeiDaoTouDaYinLianBiaoLcof().new Solution();
        ListNode listNode = new ListNode(1);
        ListNode next1 = new ListNode(3);
        ListNode next2 = new ListNode(2);
        next1.next = next2;
        listNode.next = next1;
        int[] ints = solution.reversePrint(listNode);
        for (int anInt : ints) {
            System.out.println(anInt);

        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */


    class Solution {
        public int[] reversePrint(ListNode head) {
            int[] res = new int[10000];
            int maxSize = 10000;
            int currentIndex = maxSize;
            while (head != null) {
                int val = head.val;
                currentIndex--;
                res[currentIndex] = val;
                head = head.next;
            }
            return Arrays.copyOfRange(res, currentIndex, maxSize);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}