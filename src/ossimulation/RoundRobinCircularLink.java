package ossimulation;

import Support.LLNode;
import Support.LinkedQueue;

public class RoundRobinCircularLink<T> extends LinkedQueue<Process>
{
	


	@Override
	public void enqueue(Process element)
	{
		
		if( element.getCycles() > 0  )
		this.insertAtEnd(element);
	}   

	

	
	public void insertAtEnd(Process element)
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


	/**
	 * my implementation on this method kept on being bugging used help online from avaries sources to solve the problem for this particular methd. 
	 * @param pos
	 */
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
