/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.AddTwoNumbers;
import main.ListNode;

/**
 * @author Paulo
 *
 */
class AddTwoNumbersTest {

	/**
	 * Input: l1 = [2,4,3], l2 = [5,6,4]
	 * Output: [7,0,8]
	 * Explanation: 342 + 465 = 807.
	 */
	@Test
	void test1() 
	{
		ListNode l1 = nodeInitiator(new int[] {2,4,3});
		ListNode l2 = nodeInitiator(new int[] {5,6,4});
		ListNode l3 = nodeInitiator(new int[] {7,0,8});

		ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
		
		while(l3 != null || result != null)
		{
			assertEquals(l3.val, result.val);
			
			if (l3 != null) l3 = l3.next;
			if (result != null) result = result.next;
		}
	}
	
	/**
	 * Example 2:
	 * Input: l1 = [0], l2 = [0]
	 * Output: [0]
	*/
	@Test
	void test2() 
	{
		ListNode l1 = nodeInitiator(new int[] {0});
		ListNode l2 = nodeInitiator(new int[] {0});
		ListNode l3 = nodeInitiator(new int[] {0});

		ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
		
		while(l3 != null || result != null)
		{
			assertEquals(l3.val, result.val);
			
			if (l3 != null) l3 = l3.next;
			if (result != null) result = result.next;
		}
	}
	
	/**
	 * Example 2:
	 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
	 * Output: [8,9,9,9,0,0,0,1]
	*/
	@Test
	void test3() 
	{
		ListNode l1 = nodeInitiator(new int[] {9,9,9,9,9,9,9});
		ListNode l2 = nodeInitiator(new int[] {9,9,9,9});
		ListNode l3 = nodeInitiator(new int[] {8,9,9,9,0,0,0,1});

		ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
		
		while(l3 != null || result != null)
		{
			assertEquals(l3.val, result.val);
			
			if (l3 != null) l3 = l3.next;
			if (result != null) result = result.next;
		}
	}
	
	
	public ListNode nodeInitiator(int[] numList)
	{
		ListNode nodeList = null;
		
		if(numList.length > 0)
		{
			nodeList = new ListNode(0);
			ListNode a = nodeList;
			for(int i = 0; i < numList.length; i++)
			{
				a.next = new ListNode(numList[i]);
				a = a.next;
			}
		}
		
		return nodeList;
	}

}
