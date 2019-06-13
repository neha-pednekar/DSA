package udemy.linkedlistchallenge2;

public class IntegerLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleLinkedList numberLinkedList = new SingleLinkedList();
		numberLinkedList.addNumber(30);
		numberLinkedList.addNumber(60);
		numberLinkedList.addNumber(10);
		numberLinkedList.addNumber(22);
		
		
		numberLinkedList.printLinkedList(numberLinkedList);
		System.out.println();

		System.out.println(numberLinkedList.getSize());
	}

}
