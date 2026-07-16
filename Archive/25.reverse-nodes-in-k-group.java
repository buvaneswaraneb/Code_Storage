/*
 * @lc app=leetcode id=25 lang=java
 *
 * [25] Reverse Nodes in k-Group
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    	ListNode[] reverse(ListNode start, ListNode end) {
		ListNode curr = start ;
		ListNode next = null;
		ListNode prev = null;

		while (curr != null && prev != end ) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return new ListNode[] {prev,start};
	}

	public ListNode reverseKGroup(ListNode head, int k) {

		if (head ==null || head.next == null) return head;

		ListNode dummy_head = new ListNode(0);
		ListNode dummy = dummy_head;

		var temp = head;

		while( temp != null ) {
			ListNode start = temp;
			ListNode end = temp;
			for (int i = 1 ; i < k && end != null ; i++) {
				end = end.next;
			}
			if (end == null) {
				dummy.next = start;
				break;
			}

			ListNode next_group = end.next;

			ListNode[] reverse = reverse(start,end);
			dummy.next = reverse[0];
			dummy = reverse[1];

			temp = next_group;
		}
		return dummy_head.next;
	}

}
// @lc code=end

