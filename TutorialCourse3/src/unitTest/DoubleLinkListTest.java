package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import linked.DoubleLinkedElementList;
import linked.DoubleLinkedListService;

class DoubleLinkListTest {

	@Test
	void test() {
		// Double liste chainéé
		DoubleLinkedElementList DoubleLinkedElementList4 = null;
		DoubleLinkedElementList DoubleLinkedElementList3 = null;
		DoubleLinkedElementList DoubleLinkedElementList2 = null;
		DoubleLinkedElementList DoubleLinkedElementList1 = null;
		DoubleLinkedElementList DoubleLinkedElementList0 = null;

		DoubleLinkedElementList4 = new DoubleLinkedElementList(9, DoubleLinkedElementList3, null);
		DoubleLinkedElementList3 = new DoubleLinkedElementList(1, DoubleLinkedElementList2, DoubleLinkedElementList4);
		DoubleLinkedElementList2 = new DoubleLinkedElementList(7, DoubleLinkedElementList1, DoubleLinkedElementList3);
		DoubleLinkedElementList1 = new DoubleLinkedElementList(12, DoubleLinkedElementList0, DoubleLinkedElementList2);
		DoubleLinkedElementList0 = new DoubleLinkedElementList(5, null, DoubleLinkedElementList1);

		DoubleLinkedListService doubleLinkedListService = new DoubleLinkedListService(DoubleLinkedElementList0);

		assertEquals("\n5 - 12 - 7 - 1 - 9", doubleLinkedListService.toString());
		assertEquals(5, doubleLinkedListService.Length());// size of the list

		doubleLinkedListService.AddElementAtSpeceficPosition(2, 3);// add element 3 at the position 2

		assertEquals("\n5 - 12 - 3 - 7 - 1 - 9", doubleLinkedListService.toString());

		doubleLinkedListService.AddElementAtSpeceficPosition(0, 18);// add element 18 at the position 0

		assertEquals("\n18 - 5 - 12 - 3 - 7 - 1 - 9", doubleLinkedListService.toString());

		doubleLinkedListService.AddElementAtSpeceficPosition(7, 4);// add element 4 at the position 7

		assertEquals("\n18 - 5 - 12 - 3 - 7 - 1 - 9 - 4", doubleLinkedListService.toString());

		doubleLinkedListService.RemoveElementAtSpeceficPosition(3);// delete element at the position 3

		assertEquals("\n18 - 5 - 12 - 7 - 1 - 9 - 4", doubleLinkedListService.toString());

		doubleLinkedListService.RemoveElementAtSpeceficPosition(0);// delete element at the position 0

		assertEquals("\n5 - 12 - 7 - 1 - 9 - 4", doubleLinkedListService.toString());

		doubleLinkedListService.RemoveElementAtSpeceficPosition(5);// delete element at the position 5

		assertEquals("\n5 - 12 - 7 - 1 - 9", doubleLinkedListService.toString());
		assertEquals(5, doubleLinkedListService.Length());// size of the list

		assertEquals(1, doubleLinkedListService.getPositionElementAtSpeceficValue(12));// Position of element 12

		assertEquals(null, doubleLinkedListService.getPositionElementAtSpeceficValue(37));// Position of element 37
		
		doubleLinkedListService.getLinkedElementListSorted(DoubleLinkedElementList0);//sort the list

		assertEquals("\n1 - 5 - 7 - 9 - 12", doubleLinkedListService.toString());

		// Double liste chainéé
		DoubleLinkedElementList DoubleLinkedElementSortedList4 = null;
		DoubleLinkedElementList DoubleLinkedElementSortedList3 = null;
		DoubleLinkedElementList DoubleLinkedElementSortedList2 = null;
		DoubleLinkedElementList DoubleLinkedElementSortedList1 = null;
		DoubleLinkedElementList DoubleLinkedElementSortedList0 = null;

		DoubleLinkedElementSortedList4 = new DoubleLinkedElementList(22, DoubleLinkedElementSortedList3, null);
		DoubleLinkedElementSortedList3 = new DoubleLinkedElementList(14, DoubleLinkedElementSortedList2,
				DoubleLinkedElementSortedList4);
		DoubleLinkedElementSortedList2 = new DoubleLinkedElementList(12, DoubleLinkedElementSortedList1,
				DoubleLinkedElementSortedList3);
		DoubleLinkedElementSortedList1 = new DoubleLinkedElementList(7, DoubleLinkedElementSortedList0,
				DoubleLinkedElementSortedList2);
		DoubleLinkedElementSortedList0 = new DoubleLinkedElementList(5, null, DoubleLinkedElementSortedList1);
		
		DoubleLinkedListService doubleLinkedListSortedService = new DoubleLinkedListService(DoubleLinkedElementSortedList0);
		
		assertEquals("\n5 - 7 - 12 - 14 - 22", doubleLinkedListSortedService.toString());
		
		doubleLinkedListSortedService.AddElementAtTheCorrectPosition(9);//add element 9 at the correct position
		doubleLinkedListSortedService.AddElementAtTheCorrectPosition(16);//add element 16 at the correct position
		doubleLinkedListSortedService.AddElementAtTheCorrectPosition(32);//add element 32 at the correct position
		doubleLinkedListSortedService.AddElementAtTheCorrectPosition(1);//add element 1 at the correct position
		
		assertEquals("\n1 - 5 - 7 - 9 - 12 - 14 - 16 - 22 - 32", doubleLinkedListSortedService.toString());
	}

}
