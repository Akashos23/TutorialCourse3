package linked;

public class LinkedListService {
	private LinkedElementList linkedList;
	
	public LinkedListService(LinkedElementList linkedList) {
		this.linkedList = linkedList;
	}
	
	public void AddElementAtSpeceficPosition(int position, int value) {
		if(linkedList == null) {
			linkedList = new LinkedElementList(value,null);
			return;
		}
		
	    if(position == 0) {
	    	LinkedElementList newElement = new LinkedElementList(value, linkedList);
	    	linkedList = newElement;
			return;
		}
	    
		int pos = 0;
		LinkedElementList previousValue = null;
		LinkedElementList linkList = linkedList;
		while(linkList != null) {
			if(pos + 1 == position) {
				previousValue = linkList;
			}
			if(position == pos) {
				LinkedElementList linkElementNext = linkList;
				LinkedElementList newElement = new LinkedElementList(value, linkElementNext);
				previousValue.setNextElement(newElement);
				break;
			}
			if(linkList.getNextElement() == null) {
				LinkedElementList newElementAtTheEndOfTheList = new LinkedElementList(value, null);
				linkList.setNextElement(newElementAtTheEndOfTheList);
				break;
			}
			linkList = linkList.getNextElement();
			pos++;
			
			
		}
	}
	
	public void RemoveElementAtSpeceficPosition(int position) {
		if(linkedList == null) {
			return;
		}

		int pos = 0;
		LinkedElementList linkList = linkedList;
		LinkedElementList previousElement = null;
		if(linkList.getNextElement() == null) {
			linkedList = null;
			return;
		}
		
		if(position == 0) {
			this.linkedList = this.linkedList.getNextElement();
			return;
		}
		
		while(linkList != null) {
			if(pos + 1 == position) {
				previousElement = linkList;
			}
			if(position == pos) {
				LinkedElementList newElement = linkList.getNextElement();
				previousElement.setNextElement(newElement);
				break;
			}
			linkList = linkList.getNextElement();
			pos++;
		}
	}
	
	public Integer getPositionElementAtSpeceficValue(int value) {
		if(linkedList == null) {
			return null;
		}

		int pos = 0;
		LinkedElementList linkList = linkedList;
		while(linkList != null) {
			if(linkList.getElement() == value) {
				return pos;
			}
			linkList = linkList.getNextElement();
			pos++;
		}
		return null;
	}
	
	public void AddElementAtTheCorrectPosition(int value) {
		if(linkedList == null) {
			linkedList = new LinkedElementList(value, null);
			return;
		}
		
		int pos = 0;
		boolean stop = false;
		LinkedElementList linkList = linkedList;
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
	
	
	public int Length() {
		int cpt = 0;
		LinkedElementList linkList = linkedList;
		while(linkList!= null) {
			cpt++;
			linkList = linkList.getNextElement();
		}
		return cpt;
	}
	
	public boolean isEmpty() {
		return linkedList == null ? true : false;
	}
	
	public LinkedElementList getLinkedElementListSorted(LinkedElementList listUnSorted) {
		boolean stop = false;
		int firstElement = listUnSorted.getElement();
		
		this.linkedList = new LinkedElementList(firstElement, null);
		
		
		LinkedElementList linkList = listUnSorted;
		while(!stop) {
			AddElementAtTheCorrectPosition(linkList.getElement());
			if(linkList.getNextElement() == null) {
				stop = true;
			}
			else {
				linkList = linkList.getNextElement();
			}
		}		
		return this.linkedList;
	}

	@Override
	public  String toString() {
		String retour = "\n";
		LinkedElementList linkList = linkedList;
		while(linkList!= null) {
			if(linkList.getNextElement() != null) {
				retour += linkList.getElement() + " - ";
			}
			else {
				retour += linkList.getElement();
			}
			linkList = linkList.getNextElement();
		}
		return retour;
	}
	
	public void Pop() {
		boolean stop = false;

		if(linkedList == null) {
			return;
		}
		
		if(linkedList.getNextElement() == null) {
			linkedList = null;
			return;
		}
		
		LinkedElementList linkList = linkedList;
		while(!stop) {
			if(linkList.getNextElement() == null) {
				stop = true;
			}
			else {
				if(linkList.getNextElement().getNextElement() == null) {
						linkList.setNextElement(null);
						stop = true;
				}
				linkList = linkList.getNextElement();

			}
		}
	}
	
	public void Push(int value) {
		boolean stop = false;
		
		if(linkedList == null) {
			linkedList = new LinkedElementList(value, null);
			return;
		}
		
		LinkedElementList linkList = linkedList;
		while(!stop) {
			if(linkList.getNextElement() == null) {
				linkList.setNextElement(new LinkedElementList(value, null));
				stop = true;
			}
			else {
				linkList = linkList.getNextElement();
			}
		}
	}
}
