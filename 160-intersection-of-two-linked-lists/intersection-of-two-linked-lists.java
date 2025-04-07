/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> map = new HashSet<>();
        while(headA != null){
            map.add(headA);
            headA = headA.next;
        }
        ListNode val = null;
        while(headB != null){
            if(map.contains(headB)){
                val = headB;
                break;
            }
            headB = headB.next;
        }
        return val;
    }
}