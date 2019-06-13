package udemy.linkedlistchallenge2;

public class IntegerNode {

	private Integer number;
	
	private IntegerNode nextNode;

	public IntegerNode(Integer number) {
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public IntegerNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(IntegerNode nextNode) {
		this.nextNode = nextNode;
	}
	
	
}
