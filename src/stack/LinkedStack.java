package stack;

public class LinkedStack {

	public static void main(String[] args) {
		StackL sl = new StackL();
		sl.push(10);
		sl.push(20);
		sl.push(30);
		sl.push(40);
		sl.pop();
		sl.traverse();
	}
}

class Node{
	int data;
	Node next;
}

class StackL{
	Node top;
	
	public void push(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next=top;
		top = node;
	}
	public void pop()
	{
		top = top.next;
	}
	public void traverse()
	{
		Node n = top;
		while(n.next != null) 
		{
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}
}
