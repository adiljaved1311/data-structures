package stack;
import java.util.*;

public class ArrayStack {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(5);
		s.push(10);
		s.push(15);
		//s.traverse();
		s.pop();
		s.push(20);
		s.traverse();
	}
}

class Stack{
	Scanner sc = new Scanner(System.in);
	int stack[] = new int[3];
	int top = -1;
	
	public void push(int data)
	{
		if(top != (stack.length)-1)
		{
			int num = data;
			top++;
			stack[top] = num;
		}
		else
		{
			System.out.println("Stack is Full");
		}
	}
	
	public void pop()
	{
		if(top != -1)
		{
			int num = stack[top];
			System.out.println("Elements poped from stack is : "+num);
		}
		else
		{
			System.out.println("Stack is Empty");
		}
	}
	
	public void traverse()
	{
		if(top != 1)
		{
			System.out.println("Elements of stack are : ");
			for(int i=top; i>=0; i--)
			{
				System.out.println(stack[i]);
			}
		}
		else
		{
			System.out.println("Stack is Empty");
		}
	}
}
