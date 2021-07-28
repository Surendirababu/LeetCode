package AddTwoNumbers;

import java.util.*;

public class ListNode {

      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

      public static void main(String a[]) {

          ListNode src3 = new ListNode(3, null);
          ListNode src2 = new ListNode(4, src3 );
          ListNode src1 = new ListNode(2, src2 );

          ListNode des3 =  new ListNode(4, null);
          ListNode des2 = new ListNode(6, des3 );
          ListNode des1 = new ListNode(5, des2 );

          Solution s1 = new Solution();

          ListNode finalDt = s1.addTwoNumbers(src1,des1);
          while(finalDt.next != null) {
              System.out.println("Val" + finalDt.val);
              finalDt = finalDt.next;
          }

          if(finalDt.next == null) {
              System.out.println("Val" + finalDt.val);
          }

      }

}



class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode p = l1;
        ListNode q = l2;
        ListNode head = new ListNode(0);
        int carry = 0;
        ListNode curr = head;
        while(p!=null || q!= null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum /10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }
        if(carry > 0) {
            curr.next = new ListNode(carry);
        }

        return head.next;
    }
}