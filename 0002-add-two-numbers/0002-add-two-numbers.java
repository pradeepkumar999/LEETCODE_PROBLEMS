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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify the code
        ListNode current = dummy; // Pointer to the current node in the result linked list
        int carry = 0; // Variable to store the carry
        
        while (l1 != null || l2 != null) {
            // Get the values of the current nodes or 0 if one list is exhausted
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            
            int sum = x + y + carry; // Calculate the sum
            
            carry = sum / 10; // Update the carry
            
            current.next = new ListNode(sum % 10); // Create a new node with the digit
            
            current = current.next; // Move the current pointer
            
            // Move to the next nodes if available
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        // Check if there is a remaining carry
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        return dummy.next; // Return the result linked list without the dummy node
    }
}
