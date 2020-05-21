package queue;
public class LinkedQueue 
{
	public static void main(String[] args) 
	{
		QueueL q = new QueueL();
		q.enqueue(2);
		q.enqueue(5);
		q.enqueue(8);
		q.enqueue(9);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(15);
		q.dequeue();
		q.enqueue(2);
		q.show();
	}
}

class Node
{
	Node next;
	int data;
}

class QueueL
{
	Node front;
	
	public void enqueue(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(front == null)
		{
			front = node;
		}else 
		{
			Node n = front;
			while(n.next != null)
			{
				n = n.next;
			}
			n.next = node;
		}
	}
	public void show()
	{
		if(front != null)
		{
		  Node n = front;
		  while(n.next != null)
		  {
			System.out.println(n.data);
			n = n.next;
		  }
		    System.out.println(n.data);
	     }
		else 
		{
	    	System.out.println("Queue is empty");
	    }
	}
	
	public void dequeue()
	{
		if(front != null)
		{
		  if(front.next == null)
		  {
			front = null;
		  }else
		front = front.next;
	     }
	    else 
	    {
		System.out.println("No element in Queue");
	    }
     }
}
	
	
	