package udemy.singlelinkedlist;

public class SingleLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student neha = new Student("Neha", "Pednekar", 1);
		Student rahul = new Student("Rahul", "Gholap", 2);
		Student bhairavi = new Student("Bhairavi", "Phadnis", 3);
		Student neel = new Student("Neel", "Sabnis", 4);
		
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		singleLinkedList.addToFront(neha);
		singleLinkedList.addToFront(rahul);
		singleLinkedList.addToFront(bhairavi);
		singleLinkedList.addToFront(neel);
		
		singleLinkedList.printLinkedList(singleLinkedList);
		
		System.out.println();
		
		System.out.println(singleLinkedList.getSize());
		
		System.out.println(singleLinkedList.isEmpty());
		
		singleLinkedList.removeFromFront();
		
		System.out.println();
		
		singleLinkedList.printLinkedList(singleLinkedList);
		
		System.out.println();
		
		System.out.println(singleLinkedList.getSize());
		
		System.out.println(singleLinkedList.isEmpty());
		
	}

}
