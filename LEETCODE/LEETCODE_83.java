1. 
 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode cur = head.next;
        ListNode pre = head;
        while(cur != null){
            if(cur.val == pre.val){
                if(cur.next != null){
                    cur.val = cur.next.val;
                    cur.next = cur.next.next;
                }else{
                    pre.next = null;
                    cur = null;
                }  
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}
  
2. 재귀함수를 이용
vpublic ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
}  
