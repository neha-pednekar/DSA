package udemy.doublelinkedlist;

import udemy.singlelinkedlist.SingleLinkedList;

public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student neha = new Student("Neha", "Pednekar", 1);
		Student rahul = new Student("Rahul", "Gholap", 2);
		Student bhairavi = new Student("Bhairavi", "Phadnis", 3);
		Student neel = new Student("Neel", "Sabnis", 4);
		Student maheep = new Student("Maheep", "Malhotra", 5);
		
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		doubleLinkedList.addToFront(neha);
		doubleLinkedList.addToFront(rahul);
		doubleLinkedList.addFromBehind(bhairavi);
		doubleLinkedList.addFromBehind(neel);
		
		doubleLinkedList.printLinkedList(doubleLinkedList);
		
		System.out.println();
		
		System.out.println(doubleLinkedList.getSize());
		
		System.out.println(doubleLinkedList.isEmpty());
		
		
		doubleLinkedList.addBefore(maheep, bhairavi);
		
		doubleLinkedList.printLinkedList(doubleLinkedList);

		System.out.println();
		
		System.out.println(doubleLinkedList.getSize());
		
		System.out.println(doubleLinkedList.isEmpty());

		
		
//		doubleLinkedList.removeFromFront();
//		
//		System.out.println();
//		
//		doubleLinkedList.printLinkedList(doubleLinkedList);
//		
//		System.out.println();
//		
//		System.out.println(doubleLinkedList.getSize());
//		
//		doubleLinkedList.removeFromBehind();
//		
//		System.out.println();
//		
//		doubleLinkedList.printLinkedList(doubleLinkedList);
//		
//		System.out.println();
//		
//		System.out.println(doubleLinkedList.getSize());
		
	}

}
