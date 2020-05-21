package queue;
public class CircularArrayQ 
{
	public static void main(String[] args) 
	{
		CQueue q = new CQueue();
		q.enqueue(5);
		q.enqueue(18);
		q.enqueue(47);
		q.dequeue();
		q.enqueue(1);
		q.show();
	}
}
class CQueue
{
	int num;
	int size = 3;
	int queue[] = new int[size];
	int front =-1;
	int rear = -1;
	
	public void enqueue(int data)
	{
		if((front == 0 && rear == size-1) || front == rear+1)
		{
			System.out.println("Queue is Full");
		}
		else
		{
			if(front == -1)
			{
				front = rear = 0;
			}
			else if(rear == size-1)
			{
				rear = 0;
			}else
			{
				rear++;
			}
			num = data;
			queue[rear] = num;
		}
	}
	
	public void dequeue()
	{
		if(front != -1)
		{
			num = queue[front];
			System.out.println("Element dequeue : "+num);
			if(front == rear)
			{
				front = rear = -1;
			}else if(front == size-1)
			{
				front = 0;
			}else
			{
				front++;
			}
		}else
		{
			System.out.println("Queue is empty");
		}
	}
	
	public void show()
	{
		if(front != -1)
		{
			if(front<=rear)
			{
				for(int i=front;i<=rear;i++)
				{
					System.out.println(queue[i]);
				}
			}else
			{
				for(int i=front;i<=size-1;i++)
				{
					System.out.println(queue[i]);
				}
				for(int i=0;i<=rear;i++)
				{
					System.out.println(queue[i]);
				}
			}
		}else
		{
			System.out.println("No element is present in Queue");
		}
	}
}
