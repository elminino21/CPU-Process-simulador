/*
Michael Penta
This is a first come first serve Process scheduler
Each processes in the queue is run in the order
in which they arrive and each process is run to completion before moving to next
A queue is used to enforce FIFO order
*/
package ossimulation;

import Support.LinkedQueue;

class FirstComeFistServeScheduler implements ProcessScheduler
{   
    LinkedQueue<Process> q;
    Process processToRun;

    public FirstComeFistServeScheduler()
    {
        q = new LinkedQueue<Process>();
    }

    
    public Process getProcessToRun()
    {
        /*
            first come first serve. 
            if the running process can run, it will continue until finished
            otherwise get a new process to run
            if the queue is empty, run an idle process
        */
  
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

   /*
    all new processes go to the back of the queueu
    */
    
    public void scheduleProcess(Process p)
    {
        System.out.println("Scheduling PID "+p.getId());
        q.enqueue(p);
    }
    
}
