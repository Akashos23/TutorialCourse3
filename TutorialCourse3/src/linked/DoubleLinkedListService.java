package linked;

public class DoubleLinkedListService {
	private DoubleLinkedElementList DoubleLinkedList;
	
	public DoubleLinkedListService(DoubleLinkedElementList DoubleLinkedList) {
		this.DoubleLinkedList = DoubleLinkedList;
	}
	
	public void AddElementAtSpeceficPosition(int position, int value) {
		if(DoubleLinkedList == null) {
			DoubleLinkedList = new DoubleLinkedElementList(value,null, null);
			return;
		}
		
	    if(position == 0) {
	    	DoubleLinkedElementList newElement = new DoubleLinkedElementList(value, null,DoubleLinkedList);
	    	DoubleLinkedList = newElement;
			return;
		}
		
		int pos = 0;
		DoubleLinkedElementList previousValue = null;
		DoubleLinkedElementList linkList = DoubleLinkedList;
		while(linkList != null) {
			if(pos + 1 == position) {
				previousValue = linkList;
			}
			if(position == pos) {
				DoubleLinkedElementList linkElementNext = linkList;
				DoubleLinkedElementList newElement = new DoubleLinkedElementList(value, linkList.getPreviousElement(),linkElementNext);
				previousValue.setNextElement(newElement);
				break;
			}
			if(linkList.getNextElement() == null) {
				DoubleLinkedElementList newElementAtTheEndOfTheList = new DoubleLinkedElementList(value, linkList, null);
				linkList.setNextElement(newElementAtTheEndOfTheList);
				break;
			}
			linkList = linkList.getNextElement();
			pos++;
		}
	}
	
	public void RemoveElementAtSpeceficPosition(int position) {
		if(DoubleLinkedList == null) {
			return;
		}

		int pos = 0;
		DoubleLinkedElementList linkList = DoubleLinkedList;
		DoubleLinkedElementList previousElement = null;
		if(linkList.getNextElement() == null) {
			DoubleLinkedList = null;
			return;
		}
		
		if(position == 0) {
			this.DoubleLinkedList = this.DoubleLinkedList.getNextElement();
			return;
		}
		
		while(linkList != null) {
			if(pos + 1 == position) {
				previousElement = linkList;
			}
			if(position == pos) {
				DoubleLinkedElementList newElement = linkList.getNextElement();
				previousElement.setNextElement(newElement);
				if(newElement != null) {
					newElement.setPreviousElement(previousElement);
				}
				break;
			}
			linkList = linkList.getNextElement();
			pos++;
		}
	}
	
	public int Length() {
		int cpt = 0;
		DoubleLinkedElementList linkList = DoubleLinkedList;
		while(linkList!= null) {
			cpt++;
			linkList = linkList.getNextElement();
		}
		return cpt;
	}
	
	public Integer getPositionElementAtSpeceficValue(int value) {
		if(DoubleLinkedList == null) {
			return null;
		}

		int pos = 0;
		DoubleLinkedElementList linkList = DoubleLinkedList;
		while(linkList != null) {
			if(linkList.getElement() == value) {
				return pos;
			}
			linkList = linkList.getNextElement();
			pos++;
		}
		return null;
	}
	
	@Override
	public  String toString() {
		String retour = "\n";
		DoubleLinkedElementList DoublelinkList = DoubleLinkedList;
		while(DoublelinkList!= null) {
			if(DoublelinkList.getNextElement() != null) {
				retour += DoublelinkList.getElement() + " - ";
			}
			else {
				retour += DoublelinkList.getElement();
			}
			DoublelinkList = DoublelinkList.getNextElement();
		}
		return retour;
	}
	
	public void AddElementAtTheCorrectPosition(int value) {
		if(DoubleLinkedList == null) {
			DoubleLinkedList = new DoubleLinkedElementList(value, null, null);
			return;
		}
		
		int pos = 0;
		boolean stop = false;
		DoubleLinkedElementList linkList = DoubleLinkedList;
		int firstElement = linkList.getElement();
		if(value < firstElement) {
			AddElementAtSpeceficPosition(pos, value);
		}
		else {
			while(!stop) {
				int val = linkList.getElement();
				Integer nextVal = null;

				if(linkList.getNextElement() != null) {
					nextVal = linkList.getNextElement().getElement();
				}
				
				if(value > val && nextVal == null || value > val && value < nextVal) {
					AddElementAtSpeceficPosition(pos + 1, value);
					stop = true;
				}
				

				if(linkList.getNextElement() == null) {
					stop = true;
				}
				else {
					linkList = linkList.getNextElement();
				}
				pos++;
			}
		}
		
	}
	
	public DoubleLinkedElementList getLinkedElementListSorted(DoubleLinkedElementList listUnSorted) {
		boolean stop = false;
		int firstElement = listUnSorted.getElement();
	
		this.DoubleLinkedList = new DoubleLinkedElementList(firstElement, null,null);
		
		
		DoubleLinkedElementList linkList = listUnSorted;
		while(!stop) {
			AddElementAtTheCorrectPosition(linkList.getElement());
			if(linkList.getNextElement() == null) {
				stop = true;
			}
			else {
				linkList = linkList.getNextElement();
			}
		}
				
		
		return this.DoubleLinkedList;
	}
	
	
}
