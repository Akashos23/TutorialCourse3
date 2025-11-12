package linked;

public class LinkedElementList {
	private int element;
	private LinkedElementList nextElement;
	
	public LinkedElementList(int element, LinkedElementList nextElement) {
		this.element = element;
		this.nextElement = nextElement;
	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	public LinkedElementList getNextElement() {
		return nextElement;
	}

	public void setNextElement(LinkedElementList nextElement) {
		this.nextElement = nextElement;
	}
	
	
}
