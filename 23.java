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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);

        for(int i=0; i<lists.length; i++) {
            if(lists[i] != null) {
                pq.add(lists[i]);
            }
        }

        ListNode root = null;
        if(!pq.isEmpty()) {
            ListNode node = pq.remove();
            if(node.next != null) {
                pq.add(node.next);
            }
            root = node;
        }

        ListNode temp = root;
        while(!pq.isEmpty()) {
            ListNode node = pq.remove();
            if(node.next != null) {
                pq.add(node.next);
            }
            temp.next = node;
            temp = temp.next;
        }

        return root;
    }
}