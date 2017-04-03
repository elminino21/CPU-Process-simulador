/*
Michael Penta
An interface for a process scheduler
Your schedulers must implement this
*/
package ossimulation;

public interface ProcessScheduler
{
    public Process getProcessToRun();
    public void scheduleProcess(Process p);
}
