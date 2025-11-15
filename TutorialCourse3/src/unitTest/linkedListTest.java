package unitTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import linked.LinkedElementList;
import linked.LinkedListService;

class linkedListTest {

	@Test
	void test() {
		LinkedElementList listElement4 = new LinkedElementList(9, null);
		LinkedElementList listElement3 = new LinkedElementList(1, listElement4);
		LinkedElementList listElement2 = new LinkedElementList(7, listElement3);
		LinkedElementList listElement1 = new LinkedElementList(12, listElement2);
		LinkedElementList listElement0 = new LinkedElementList(5, listElement1);

		LinkedListService linkList = new LinkedListService(listElement0);

		assertEquals("\n5 - 12 - 7 - 1 - 9", linkList.toString()); // start state of linked list
		assertEquals(5, linkList.Length());

		linkList.AddElementAtSpeceficPosition(3, 4);// Add element 4 at the position 3

		assertEquals("\n5 - 12 - 7 - 4 - 1 - 9", linkList.toString());

		linkList.AddElementAtSpeceficPosition(0, 7);// Add element 7 at the position 0

		assertEquals("\n7 - 5 - 12 - 7 - 4 - 1 - 9", linkList.toString());

		linkList.AddElementAtSpeceficPosition(7, 2);// Add element 2 at the position 6

		assertEquals("\n7 - 5 - 12 - 7 - 4 - 1 - 9 - 2", linkList.toString());

		linkList.RemoveElementAtSpeceficPosition(5);// remove element at position 5

		assertEquals("\n7 - 5 - 12 - 7 - 4 - 9 - 2", linkList.toString());

		linkList.RemoveElementAtSpeceficPosition(0);// remove element at position 0

		assertEquals("\n5 - 12 - 7 - 4 - 9 - 2", linkList.toString());

		linkList.RemoveElementAtSpeceficPosition(5);// remove element at position 5

		assertEquals("\n5 - 12 - 7 - 4 - 9", linkList.toString());

		assertEquals(5, linkList.Length());

		assertEquals(2, linkList.getPositionElementAtSpeceficValue(7));// Position of element 7

		assertEquals(null, linkList.getPositionElementAtSpeceficValue(37));// Position of element 37

		assertFalse(linkList.isEmpty()); // List is not empty

		LinkedElementList listElementEmpty0 = null;

		LinkedListService linkListEmpty = new LinkedListService(listElementEmpty0);// List with no element

		assertTrue(linkListEmpty.isEmpty());// List is empty

		linkList.Pop();// delete last element of the list
		linkList.Pop();// delete last element of the list
		assertEquals("\n5 - 12 - 7", linkList.toString());

		linkList.Push(42);// Add value 42 at the end of the list
		linkList.Push(10);// Add value 10 at the end of the list
		assertEquals("\n5 - 12 - 7 - 42 - 10", linkList.toString());

		linkList.Pop();// delete last element of the list
		linkList.Pop();// delete last element of the list
		linkList.Pop();// delete last element of the list
		linkList.Pop();// delete last element of the list
		linkList.Pop();// delete last element of the list
		linkList.Pop();// delete last element of the list

		assertEquals("\n", linkList.toString());

		linkList.Push(20);// Add value 20 at the end of the list

		assertEquals("\n20", linkList.toString());

		// sort list
		LinkedElementList listElementSort4 = new LinkedElementList(15, null);
		LinkedElementList listElementSort3 = new LinkedElementList(14, listElementSort4);
		LinkedElementList listElementSort2 = new LinkedElementList(10, listElementSort3);
		LinkedElementList listElementSort1 = new LinkedElementList(6, listElementSort2);
		LinkedElementList listElementSort0 = new LinkedElementList(2, listElementSort1);

		LinkedListService linkListSort = new LinkedListService(listElementSort0);
		assertEquals("\n2 - 6 - 10 - 14 - 15", linkListSort.toString());

		linkListSort.AddElementAtTheCorrectPosition(12);// Add element 12 at the correct position depends on the sort
														// list
		linkListSort.AddElementAtTheCorrectPosition(34);// Add element 34 at the correct position depends on the sort
														// list
		linkListSort.AddElementAtTheCorrectPosition(1);// Add element 1 at the correct position depends on the sort list

		assertEquals("\n1 - 2 - 6 - 10 - 12 - 14 - 15 - 34", linkListSort.toString());

		// List unsorted
		LinkedElementList listElementUnSorted4 = new LinkedElementList(1, null);
		LinkedElementList listElementUnSorted3 = new LinkedElementList(12, listElementUnSorted4);
		LinkedElementList listElementUnSorted2 = new LinkedElementList(9, listElementUnSorted3);
		LinkedElementList listElementUnSorted1 = new LinkedElementList(4, listElementUnSorted2);
		LinkedElementList listElementUnSorted0 = new LinkedElementList(8, listElementUnSorted1);

		LinkedListService linkListUnSort = new LinkedListService(null);
		linkListUnSort.getLinkedElementListSorted(listElementUnSorted0);//Sort the list
		assertEquals("\n1 - 4 - 8 - 9 - 12", linkListUnSort.toString());
	}

}
