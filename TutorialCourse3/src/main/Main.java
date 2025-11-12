package main;

import linked.LinkedElementList;
import linked.LinkedListService;

public class Main {

	public static void main(String[] args) {
		//Première liste
		LinkedElementList listElement4 = new LinkedElementList(9,null);
		LinkedElementList listElement3 = new LinkedElementList(1,listElement4);
		LinkedElementList listElement2 = new LinkedElementList(7,listElement3);
		LinkedElementList listElement1 = new LinkedElementList(12,listElement2);
		LinkedElementList listElement0 = new LinkedElementList(5,listElement1);
		
		
		LinkedListService linkList = new LinkedListService(listElement0);
		linkList.displayLinkedList();
		System.out.println();
		System.out.println("Taille de la liste : " + linkList.Length());
		
		linkList.AddElementAtSpeceficPosition(7, 4);
		linkList.displayLinkedList();
		
		
		linkList.RemoveElementAtSpeceficPosition(3);
		linkList.displayLinkedList();
		
		
		System.out.println();
		System.out.println("Taille de la liste : " + linkList.Length());
		
		Integer position = linkList.getPositionElementAtSpeceficValue(7);
		
		if(position != null) {
			System.out.println("Position de la valeur suivante 7 : " + position);
		}
		else {
			System.out.println("Valeur 7 non existant");
		}
		
		boolean listEmpty = linkList.isEmpty();
		
		if(listEmpty) {
			System.out.println("La liste est vide");
		}
		else {
			System.out.println("La liste n'est pas vide");
		}
		
		linkList.Pop();
		System.out.println();
		System.out.println("Retirer le dernier elements de la liste");
		linkList.displayLinkedList();
		
		linkList.Push(42);
		System.out.println();
		System.out.println("Ajouter element a la fin de la liste");
		linkList.displayLinkedList();
		
		//Liste triée
		LinkedElementList listElementSort4 = new LinkedElementList(15,null);
		LinkedElementList listElementSort3 = new LinkedElementList(14,listElementSort4);
		LinkedElementList listElementSort2 = new LinkedElementList(10,listElementSort3);
		LinkedElementList listElementSort1 = new LinkedElementList(6,listElementSort2);
		LinkedElementList listElementSort0 = new LinkedElementList(2,listElementSort1);
		
		
		LinkedListService linkListSort = new LinkedListService(listElementSort0);	
		linkListSort.AddElementAtTheCorrectPosition(1);
		
		System.out.println();
		System.out.println("Ajouter element a la bonne position");
		linkListSort.displayLinkedList();
		
		//Liste triée
		LinkedElementList listElementUnSorted4 = new LinkedElementList(1,null);
		LinkedElementList listElementUnSorted3 = new LinkedElementList(12,listElementUnSorted4);
		LinkedElementList listElementUnSorted2 = new LinkedElementList(9,listElementUnSorted3);
		LinkedElementList listElementUnSorted1 = new LinkedElementList(4,listElementUnSorted2);
		LinkedElementList listElementUnSorted0 = new LinkedElementList(8,listElementUnSorted1);
		
		LinkedListService linkListUnSort = new LinkedListService(null);	
		LinkedElementList linkedListeSorted = linkListUnSort.getLinkedElementListSorted(listElementUnSorted0);
		System.out.println();
		System.out.println("Liste triée");
		linkListUnSort.displayLinkedList();
	}

}
