package udemy.singlelinkedlist;

public class StudentNode {

	private Student student;
	private StudentNode nextNode;
	
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
	public StudentNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(StudentNode nextNode) {
		this.nextNode = nextNode;
	}
	
	
	
}
