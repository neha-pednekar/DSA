package udemy.doublelinkedlist;

public class DoubleLinkedList {

	private StudentNode headNode;
	
	private StudentNode tailNode;
	
	int size;
	
	public void addToFront(Student student) {
		StudentNode newStudentNode = new StudentNode(student);
		newStudentNode.setNextNode(headNode);
		
		if(headNode == null)
		{
			tailNode = newStudentNode;
		}
		else {
			headNode.setPreviousNode(newStudentNode);
		}
		
		headNode = newStudentNode;
		size++;
	}
	
	public void addFromBehind(Student student)
	{
		StudentNode newStudentNode = new StudentNode(student);
		newStudentNode.setPreviousNode(tailNode);
		
		if(tailNode == null)
		{
			headNode = newStudentNode;
		}
		else {
			tailNode.setNextNode(newStudentNode);
		}
		
		tailNode = newStudentNode;
		size++;
	}
	
    public boolean addBefore(Student newStudent, Student targetStudent)
    {  
    	StudentNode currentNode = headNode;
    	while(currentNode != null && !currentNode.getHead().equals(targetStudent))
    	{
    		currentNode = currentNode.getNextNode();
    	}
    	
    	if(currentNode == null)
    	{
    		return false;
    	}
    	
    	
				StudentNode newStudentNode = new StudentNode(newStudent);
				newStudentNode.setPreviousNode(currentNode.getPreviousNode());
				newStudentNode.setNextNode(currentNode);
				currentNode.setPreviousNode(newStudentNode);
				size++;
				
				if(headNode == currentNode)
		    	{
		    		headNode = newStudentNode;
		    	}
				else {
					newStudentNode.getPreviousNode().setNextNode(newStudentNode);
				}
				
				
		return true;
    	
    	
    }
    
    public StudentNode getNode(Student student)
    {
    	if(isEmpty())
		{
			return null;
		}
    	
    	while(headNode.getNextNode() != null)
    	{
    		if(headNode.getHead().getFirstName().equals(student.getFirstName()) &&
    				headNode.getHead().getLastName().equals(student.getLastName()) &&
    				headNode.getHead().getRollNumber() == student.getRollNumber())
    		{
    			return headNode;
    		}
    			headNode = headNode.getNextNode();
    	}
    	
    	return null;
    	
    }
	
	public Student removeFromFront()
	{
		if(isEmpty())
		{
			return null;
		}
		
		Student removedStudent = headNode.getHead();
		
		if(headNode.getNextNode() == null)
		{
			tailNode = null;
		}
		else {
			headNode.getNextNode().setPreviousNode(null);
		}
		
		headNode = headNode.getNextNode();
		size--;
		return removedStudent;
	}
	
	public Student removeFromBehind()
	{
		if(isEmpty())
		{
			return null;
		}
		
		Student removedStudent = tailNode.getTail();
		
		if(tailNode.getPreviousNode() == null)
		{
			headNode = null;
		}
		else {
			tailNode.getPreviousNode().setNextNode(null);
		}
		
		
		tailNode = tailNode.getPreviousNode();
		size--;
		return removedStudent;
	}
	
	public boolean isEmpty()
	{
		if(headNode == null)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void printLinkedList(DoubleLinkedList doubleLinkedList)
	{
		//Print from head
		System.out.print("HEAD -> ");
		
		StudentNode currentNode = headNode;
		while(currentNode != null)
		{
			System.out.print(currentNode.getHead() + " <=> ");
			currentNode = currentNode.getNextNode();
		}
		
		System.out.print("null");
		System.out.println();
		
	}
	
	
}
