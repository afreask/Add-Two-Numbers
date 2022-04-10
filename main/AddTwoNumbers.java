/**
 * 
 */
package main;

/**
 * @author Paulo
 *
 */
public class AddTwoNumbers 
{
	/**
		You are given two non-empty linked lists representing two non-negative integers. 
		The digits are stored in reverse order, and each of their nodes contains a single digit. 
		Add the two numbers and return the sum as a linked list.

		You may assume the two numbers do not contain any leading zero, except the number 0 itself.
		
		Example:
			Input: l1 = [2,4,3], l2 = [5,6,4]
			Output: [7,0,8]
			Explanation: 342 + 465 = 807.
			
		Constraints:
			The number of nodes in each linked list is in the range [1, 100].
			0 <= Node.val <= 9
			It is guaranteed that the list represents a number that does not have leading zeros.
	*/
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
    	ListNode result = new ListNode(0);
    	int carryOver = 0;
    	ListNode curr = result;
    	
    	while(l1 != null || l2 != null)
    	{
    		int x = (l1 != null) ? l1.val : 0;
    		int y = (l2 != null) ? l2.val : 0;
    		int sum = carryOver + x + y;
    		carryOver = sum / 10; 
    		
    		curr.next = new ListNode(sum % 10);
    		curr = curr.next;
    		
    		if (l1 != null) l1 = l1.next;
    		if (l2 != null) l2 = l2.next;
    	}
    	if(carryOver > 0)
    	{
    		curr.next = new ListNode(carryOver);
    	}
		return result.next;
    }
    
    
    
}
