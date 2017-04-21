package Support;

import java.util.Random;

public class PriorityNode<T> extends LLNode<T>{
	
	public int priority; // the higher the number the higher the priority
	
	public PriorityNode(T info)
	  {
	    super(info);
	    this.priority = radomNum();
	  }
	
	private int radomNum()
	{
		Random rand = new Random();
		return rand.nextInt(10);
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	

}
