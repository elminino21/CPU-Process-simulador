package ossimulation;

import Support.LinkedQueue;

public class RoundRobin extends LinkedQueue<Process> implements ProcessScheduler {

	
	private RoundRobinCircularLink <Process> q;
	private Process processToRun;
	
	public RoundRobin()
	{
		this.q = new RoundRobinCircularLink<Process>();
	}
	
	
	
	public Process getProcessToRun() {
		
		if(q.isEmpty() && (processToRun == null || processToRun.getCycles() <=0)) 
        {
               //if so, then make an idle process that runs for a cycle
               processToRun = new Process("Idle", 1);
        }
        else
        {
        	processToRun = q.dequeue();
        }
        System.out.println("ProcessToRun: "+processToRun);
        
       return processToRun;
	}

	public void scheduleProcess(Process p) {
		 System.out.println("Scheduling PID "+p.getId());
	        q.enqueue(p);

	}
	

    

}
