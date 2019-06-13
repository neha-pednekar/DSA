package udemy.linkedlistchallenge2;

import udemy.singlelinkedlist.Student;
import udemy.singlelinkedlist.StudentNode;

public class SingleLinkedList {

	private IntegerNode head;
	
	private int size;
	
	public void addToFront(Integer number)
	{
		IntegerNode newIntegerNode = new IntegerNode(number);
		newIntegerNode.setNextNode(head);
		head = newIntegerNode;
		size++;
		
	}
	
	public void addNumber(Integer number)
	{
		//Assumption: list is sorted
		if(head == null || head.getNumber() >= number)
		{
			addToFront(number);
			return;
		}
		
		//find the insertion point
		IntegerNode currentNode = head.getNextNode();
		IntegerNode previousNode = head;
		
		while(currentNode != null && currentNode.getNumber() < number)
		{
			previousNode = currentNode;
			currentNode = currentNode.getNextNode();
		}
		
		IntegerNode newNode = new IntegerNode(number);
		newNode.setNextNode(currentNode);
		previousNode.setNextNode(newNode);
		size++;
		
	}
	
	public Integer removeFromFront()
	{
		if(isEmpty())
		{
			return null;
		}
		
		Integer removedNumber = head.getNumber();
		head = head.getNextNode();
		size--;
		return removedNumber;
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
		
		IntegerNode currentNode = head;
		while(currentNode != null)
		{
			System.out.print(currentNode.getNumber() + " -> ");
			currentNode = currentNode.getNextNode();
		}
		System.out.print("null");
	}
}
