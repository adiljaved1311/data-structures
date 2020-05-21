package queue;

public class ArrayQueue
{
	public static void main(String[] args) 
	{
		Queue q = new Queue();
		q.enqueue(5);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(87);
		q.dequeue();
		q.dequeue();
		q.show();
		q.enqueue(15);
	}
}
class Queue
{
	int size = 4;
	int front = -1;
	int rear = -1;
	int num;
	int queue[] = new int [size];
	
	public Queue()
	{}
	
	public Queue(int s)
	{
		size = s;
	}
	
	public void enqueue(int data)
	{
		if(rear != size-1)
		{
			if(front == -1)
			{
				front = rear = 0;
			}
			else
			{
				rear++;
			}
			num = data;
			queue[rear] = num;
		}
		else 
		{
			System.out.println("Queue is Full");
		}
	}
	
	public void show()
	{
		for(int i=front ;i<=rear ; i++)
		{
			System.out.println(queue[i]);
		}
	}
	
	public void dequeue()
	{
		if(front != -1)
		{
			int num = queue[front];
			System.out.println("Element dequeue : "+num);
			front = front+1;
		}
		else
		{
			System.out.println("Queue is Empty");
		}
	}
}
