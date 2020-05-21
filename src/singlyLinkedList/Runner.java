package singlyLinkedList;

public class Runner {

	public static void main(String[] args) {
		LinkedList s1 = new LinkedList();
		s1.insertAtEnd(15);
		s1.insertAtEnd(25);
		s1.insertAtEnd(48);
		s1.insertAtEnd(6);
		s1.insertAtStart(255);
		s1.insertAtIndex(2, 78);
		s1.show();

	}

}
