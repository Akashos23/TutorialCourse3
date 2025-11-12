package linked;

public class DoubleLinkedElementList {
	private int element;
	private DoubleLinkedElementList nextElement;
	private DoubleLinkedElementList previousElement;
	
	public DoubleLinkedElementList(int element, DoubleLinkedElementList previousElement, DoubleLinkedElementList nextElement) {
		this.element = element;
		this.nextElement = nextElement;
		this.previousElement = previousElement;
	}
	
	public DoubleLinkedElementList getPreviousElement() {
		return previousElement;
	}

	public void setPreviousElement(DoubleLinkedElementList previousElement) {
		this.previousElement = previousElement;
	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	public DoubleLinkedElementList getNextElement() {
		return nextElement;
	}

	public void setNextElement(DoubleLinkedElementList nextElement) {
		this.nextElement = nextElement;
	}
	
}
