package ossimulation;

import Support.LLNode;
import Support.LinkedQueue;

public class RoundRobinCircularLink<T> extends LinkedQueue<T>
{
	
	@Override
	public T dequeue()
	{



		return null;
	}


	@Override
	public void enqueue(T element)
	{ 
		this.insertAtEnd(element);
	}   


	/* Function to insert element at end */
	public void insertAtEnd(T element)
	{
		LLNode nptr = new LLNode(element);    
		nptr.setLink(front);
		if(front == null)
		{            
			front = nptr;
			nptr.setLink(front);
			rear = front;            
		}
		else
		{
			rear.setLink(nptr);
			rear = nptr;            
		}
		numElements++ ;
	}


	/* Function to delete element at position */
	public void deleteAtPos(int pos)
	{    
		if (numElements == 1 && pos == 1)
		{
			front = null;
			rear = null;
			numElements = 0;
			return ;
		}        
		if (pos == 1) 
		{
			front = front.getLink();
			rear.setLink(front);
			numElements--; 
			return ;
		}
		if (pos == numElements) 
		{
			LLNode s = front;
			LLNode t = front;
			while (s != rear)
			{
				t = s;
				s = s.getLink();
			}
			rear = t;
			rear.setLink(front);
			numElements --;
			return;
		}
		LLNode ptr = front;
		pos = pos - 1 ;
		for (int i = 1; i < numElements - 1; i++) 
		{
			if (i == pos) 
			{
				LLNode tmp = ptr.getLink();
				tmp = tmp.getLink();
				ptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		numElements-- ;
	}


}