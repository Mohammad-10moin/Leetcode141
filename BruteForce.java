public class BruteForce {
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> present = new HashSet<ListNode>();
        ListNode temp = head;
        while(temp!=null){
            if(present.contains(temp)){
                return true;
            }
            present.add(temp);
            temp = temp.next;
        }
        return false;
    }
}