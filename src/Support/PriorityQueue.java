package Support;

import ossimulation.Process;

public class PriorityQueue<T> extends LinkedQueue<T>
{
	
		public PriorityQueue()
		{
			super();
		}
	 /**
	  * insert a node(process) on  list by cycles
	  * @param generic element
	  */
	public void sortedQueue(T element)
	{

		PriorityNode<T> newNode = new PriorityNode<T>(element);
		PriorityNode<T> tempt;
	    
	    if (rear == null)
	      front = newNode;
	    else
	    {
	    	tempt =  (PriorityNode<T>) rear;
	    	
	    	while(   tempt.getPriority() > newNode.getPriority()  && tempt.getLink() != null) 
	    	{
	    		tempt = (PriorityNode<T>) tempt.getLink(); // check next link
	    	}
	    	
	    	newNode.setLink(tempt.getLink()) ; // sets the new link 
	    	tempt.setLink(newNode); // reconects the list
	    	
	    	
	    }
	    super.numElements++; // increasest list
	}
	
}
