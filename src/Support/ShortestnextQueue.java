package Support;



public class ShortestnextQueue<T> extends LinkedQueue<T>
{
	
	
	
	/**
	 * takes process and shuffle them by processs time 
	 * @param process
	 */
	@Override
	public void enqueue(T element)
	{ 
		if(super.isEmpty())
		{
			super.enqueue(element);
		}else
		{
			
			
		}




	}   
	
	
	private T peek()
	{
		return super.front.getInfo();
	}
	
}
