package singlyLinkedList;

public class LinkedList
{
	Node head;
	
	public void insertAtEnd(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next != null)
			{
				n = n.next;
			}
			n.next = node; 
		}
	}
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
		
	}
	
	public void insertAtIndex(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		Node n = head;
		for(int i=0; i<index-1; i++) {
			n= n.next;
		}
		node.next = n.next;
		n.next = node;
	}
	
	public void show()
	{
		Node n = head;
		while(n.next !=null)
		{
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

}
