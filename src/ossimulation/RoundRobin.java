package ossimulation;

import Support.LinkedQueue;

public class RoundRobin<T> extends LinkedQueue<T> implements ProcessScheduler {

	

	
	public RoundRobin(T t)
	{
		this.q = new ShortestQueue<Process>();
	}
	
	
	
	public Process getProcessToRun() {
		
		if(q.isEmpty() && (processToRun == null || processToRun.getCycles() <=0)) 
        {
               //if so, then make an idle process that runs for a cycle
               processToRun = new Process("Idle", 1);
        }
        else if(processToRun == null || processToRun.getCycles() <=0)
        {
            //noting was running or it is done, a new process is needed
           processToRun = q.dequeue();
        }
        else
        {
            //continue to run the process that was running
        }
        System.out.println("ProcessToRun: "+processToRun);
        
       return processToRun;
	}

	public void scheduleProcess(Process p) {
		 System.out.println("Scheduling PID "+p.getId());
	        q.enqueue(p);

	}
	
	
	
	
	
	

    

}
