package udemy.singlelinkedlist;

public class SingleLinkedList {

	private StudentNode head;
	
	private int size;
	
	public void addToFront(Student student)
	{
		StudentNode newStudentNode = new StudentNode(student);
		newStudentNode.setNextNode(head);
		head = newStudentNode;
		size++;
	}
	
	public Student removeFromFront()
	{
		if(isEmpty())
		{
			return null;
		}
		
		Student removedStudent = head.getHead();
		head = head.getNextNode();
		size--;
		return removedStudent;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void printLinkedList(SingleLinkedList singleLinkedList)
	{
		System.out.print("HEAD -> ");
		
		StudentNode currentNode = head;
		while(currentNode != null)
		{
			System.out.print(currentNode.getHead() + " -> ");
			currentNode = currentNode.getNextNode();
		}
		System.out.print("null");
	}
}
