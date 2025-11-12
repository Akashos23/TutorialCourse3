package linked;

public class LinkedListService {
	private LinkedElementList linkedList;
	
	public LinkedListService(LinkedElementList linkedList) {
		this.linkedList = linkedList;
	}
	
	public void AddElementAtSpeceficPosition(int position, int value) {
		int pos = 0;
		boolean stop = false;
		Integer previousValue = null;
		LinkedElementList linkList = linkedList;
		while(!stop) {
			if(position == pos) {
				previousValue = linkList.getElement();
				linkList.setElement(value);
				
			}
			else {
				if(previousValue != null) {
					int val = linkList.getElement();
					linkList.setElement(previousValue);
					previousValue = val;
				}
			}
			if(linkList.getNextElement() == null) {
				if(previousValue != null) {
					linkList.setNextElement(new LinkedElementList(previousValue, null));
				}
				else {
					linkList.setNextElement(new LinkedElementList(value, null));
				}
				stop = true;
			}
			else {
				linkList = linkList.getNextElement();
			}
			pos++;
		}
	}
	
	public void RemoveElementAtSpeceficPosition(int position) {
		int pos = 0;
		boolean stop = false;
		boolean enter = false;
		Integer previousValue = null;
		LinkedElementList linkList = linkedList;
		while(!stop) {
			if(position == pos) {
				if(linkList.getNextElement() != null) {
					linkList.setElement(linkList.getNextElement().getElement());
					enter = true;
				}
				if(linkList.getNextElement() != null) {
					if(linkList.getNextElement().getNextElement() == null) {
						linkList.setNextElement(null);
					}
				}
			}
			else {
				if(enter) {
					if(linkList.getNextElement() != null) {
						linkList.setElement(linkList.getNextElement().getElement());
					}
					if(linkList.getNextElement() != null) {
						if(linkList.getNextElement().getNextElement() == null) {
							linkList.setNextElement(null);
						}
					}
				}
			}
			if(linkList.getNextElement() == null) {
				stop = true;
			}
			else {
				if(linkList.getNextElement().getNextElement() == null) {
					int newPosition = pos + 1;
					if(newPosition == position) {
						linkList.setNextElement(null);
						stop = true;
					}
				}
				linkList = linkList.getNextElement();

			}
			pos++;
		}
	}
	
	public Integer getPositionElementAtSpecefic(int value) {
		int pos = 0;
		boolean stop = false;
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
		int pos = 0;
		boolean stop = false;
		Integer previousValue = null;
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
	
	
	public int getLengthLinkedList() {
		int cpt = 0;
		LinkedElementList linkList = linkedList;
		while(linkList!= null) {
			cpt++;
			linkList = linkList.getNextElement();
		}
		return cpt;
	}

	
	public void displayLinkedList() {
		System.out.println();
		LinkedElementList linkList = linkedList;
		while(linkList!= null) {
			System.out.print(linkList.getElement() + " - ");
			linkList = linkList.getNextElement();
		}
		
	}
}
