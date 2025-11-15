package main;

import linked.DoubleLinkedElementList;
import linked.DoubleLinkedListService;
import linked.LinkedElementList;
import linked.LinkedListService;

public class Main {

	public static void main(String[] args) {
		// Première liste
		LinkedElementList listElement4 = new LinkedElementList(9, null);
		LinkedElementList listElement3 = new LinkedElementList(1, listElement4);
		LinkedElementList listElement2 = new LinkedElementList(7, listElement3);
		LinkedElementList listElement1 = new LinkedElementList(12, listElement2);
		LinkedElementList listElement0 = new LinkedElementList(5, listElement1);

		LinkedListService linkList = new LinkedListService(listElement0);
		System.out.println(linkList.toString());
		System.out.println();
		System.out.println("Size of the list : " + linkList.Length());

		linkList.AddElementAtSpeceficPosition(3, 4);

		System.out.println(linkList.toString());

		System.out.println("Remove element at position 4");
		linkList.RemoveElementAtSpeceficPosition(5);
		System.out.println(linkList.toString());

		System.out.println();
		System.out.println("Size of the list : " + linkList.Length());

		Integer position = linkList.getPositionElementAtSpeceficValue(7);

		if (position != null) {
			System.out.println("Position of value 7 : " + position);
		} else {
			System.out.println("Value 7 not exist");
		}

		boolean listEmpty = linkList.isEmpty();

		if (listEmpty) {
			System.out.println("List is empty");
		} else {
			System.out.println("List is not empty");
		}

		linkList.Pop();
		System.out.println();
		System.out.println("Removing the last element of the list");
		System.out.println(linkList.toString());

		linkList.Push(42);
		System.out.println();
		System.out.println("Add element at the end of the list");
		System.out.println(linkList.toString());

		// Liste triée
		LinkedElementList listElementSort4 = new LinkedElementList(15, null);
		LinkedElementList listElementSort3 = new LinkedElementList(14, listElementSort4);
		LinkedElementList listElementSort2 = new LinkedElementList(10, listElementSort3);
		LinkedElementList listElementSort1 = new LinkedElementList(6, listElementSort2);
		LinkedElementList listElementSort0 = new LinkedElementList(2, listElementSort1);

		LinkedListService linkListSort = new LinkedListService(listElementSort0);
		System.out.println(linkListSort.toString());
		linkListSort.AddElementAtTheCorrectPosition(12);

		System.out.println();
		System.out.println("Add element at the correct position");
		System.out.println(linkListSort.toString());

		// Liste triée
		LinkedElementList listElementUnSorted4 = new LinkedElementList(1, null);
		LinkedElementList listElementUnSorted3 = new LinkedElementList(12, listElementUnSorted4);
		LinkedElementList listElementUnSorted2 = new LinkedElementList(9, listElementUnSorted3);
		LinkedElementList listElementUnSorted1 = new LinkedElementList(4, listElementUnSorted2);
		LinkedElementList listElementUnSorted0 = new LinkedElementList(8, listElementUnSorted1);

		LinkedListService linkListUnSort = new LinkedListService(null);
		LinkedElementList linkedListeSorted = linkListUnSort.getLinkedElementListSorted(listElementUnSorted0);
		System.out.println();
		System.out.println("List sort");
		System.out.println(linkedListeSorted.toString());

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

		System.out.println("");
		DoubleLinkedListService doubleLinkedListService = new DoubleLinkedListService(DoubleLinkedElementList0);
		System.out.println(doubleLinkedListService.toString());
		doubleLinkedListService.AddElementAtSpeceficPosition(2, 3);
		System.out.println(doubleLinkedListService.toString());
		System.out.println("Suppression de l'élement a la position 3");
		doubleLinkedListService.RemoveElementAtSpeceficPosition(3);
		System.out.println(doubleLinkedListService.toString());

		System.out.println("Taille de la liste : " + doubleLinkedListService.Length());
		System.out.println("Position de la valeur 9 : " + doubleLinkedListService.getPositionElementAtSpeceficValue(3));

		// Double liste chainéé
		DoubleLinkedElementList DoubleLinkedElementSortedList4 = null;
		DoubleLinkedElementList DoubleLinkedElementSortedList3 = null;
		DoubleLinkedElementList DoubleLinkedElementSortedList2 = null;
		DoubleLinkedElementList DoubleLinkedElementSortedList1 = null;
		DoubleLinkedElementList DoubleLinkedElementSortedList0 = null;

		DoubleLinkedElementSortedList4 = new DoubleLinkedElementList(22, DoubleLinkedElementSortedList3, null);
		DoubleLinkedElementSortedList3 = new DoubleLinkedElementList(14, DoubleLinkedElementSortedList2, DoubleLinkedElementSortedList4);
		DoubleLinkedElementSortedList2 = new DoubleLinkedElementList(12, DoubleLinkedElementSortedList1, DoubleLinkedElementSortedList3);
		DoubleLinkedElementSortedList1 = new DoubleLinkedElementList(7, DoubleLinkedElementSortedList0, DoubleLinkedElementSortedList2);
		DoubleLinkedElementSortedList0 = new DoubleLinkedElementList(5, null, DoubleLinkedElementSortedList1);
		
		DoubleLinkedListService doubleLinkedListSortedService = new DoubleLinkedListService(DoubleLinkedElementSortedList0);
		System.out.println(doubleLinkedListSortedService.toString());
		doubleLinkedListSortedService.AddElementAtTheCorrectPosition(9);
		System.out.println(doubleLinkedListSortedService.toString());
		doubleLinkedListSortedService.getLinkedElementListSorted(DoubleLinkedElementList0);
		System.out.println(doubleLinkedListSortedService.toString());
	}

}
