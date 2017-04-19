package ossimulation;

import Support.ArrayListStack;
import Support.LLNode;
import Support.LinkedQueue;

public class ShortestJobNext<T> extends LinkedQueue<T> implements ProcessScheduler
{
	
	LinkedQueue<Process> q;
	Process processToRun;

	public ShortestJobNext(T t)
	{
		this.q = new LinkedQueue<Process>();
	}
	
	public Process getProcessToRun() {
		// TODO Auto-generated method stub
		return null;
	}

	public void scheduleProcess(Process p) {
		// TODO Auto-generated method stub

	}
	
	
	
	
	
	


}
