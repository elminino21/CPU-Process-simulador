package ossimulation;



import Support.LLNode;
import Support.LinkedQueue;

public class ShortestQueue<T> extends LinkedQueue<T>
{
	 /**
	  * insert a node(process) on  list by cycles
	  * @param generic element
	  */
	public void sortedQueue(T element)
	{

	    LLNode<T> newNode = new LLNode<T>(element);
	    LLNode<T> tempt;
	    
	    if (super.rear == null)
	      super.front = newNode;
	    else
	    {
	    	tempt = super.rear;
	    	
	    	while(   ((Process)tempt.getLink().getInfo()).getCycles() > ((Process)element).getCycles()  && tempt.getLink() != null) 
	    	{
	    		tempt = tempt.getLink(); // check next link
	    	}
	    	
	    	newNode.setLink(tempt.getLink()) ; // sets the new link 
	    	tempt.setLink(newNode); // reconects the list
	    	
	    	
	    }
	    super.numElements++; // increasest list
	}
	
}
