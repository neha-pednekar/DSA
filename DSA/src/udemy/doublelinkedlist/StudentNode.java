package udemy.doublelinkedlist;

public class StudentNode {

	private Student student;
	private StudentNode nextNode;
	private StudentNode previousNode;
	
	public StudentNode(Student student)
	{
		this.student = student;
	}
	
	public Student getHead() {
		return student;
	}
	public void setHead(Student head) {
		this.student = head;
	}
	
	public Student getTail() {
		return student;
	}
	
	public void setTail(Student tail)
	{
		this.student = tail; 
	}
	
	public StudentNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(StudentNode nextNode) {
		this.nextNode = nextNode;
	}

	public StudentNode getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(StudentNode previousNode) {
		this.previousNode = previousNode;
	}
	
	
	
	
	
}
