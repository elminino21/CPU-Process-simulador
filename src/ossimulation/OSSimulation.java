/*Michael Penta
 *An OS simmulator with an interchangable process scheduler
 */
package ossimulation;

import java.util.Random;

public class OSSimulation
{

    private final ProcessScheduler scheduler;
    private final CPU cpu;
    private double newProcessRate = 0.09;

    public OSSimulation(ProcessScheduler s)
    {
        cpu = new CPU();
        scheduler = s;
    }
    /*
     Each cycle of simulation starts with a 
     chance that new processes are generated
     Then a process is fetched from the scheduler 
     that process is run on the cpu for one cycle
     */

    public void simulate(int cyclesToSimulate)
    {
        Random rand = new Random();

        System.out.println("CYCLES TO SIMULATE : " + cyclesToSimulate);

        scheduler.scheduleProcess(new Process("SystemStartUp", 10));

        while (cyclesToSimulate > 0)
        {
            if (rand.nextDouble() < newProcessRate)
            {
                scheduler.scheduleProcess(this.getRandomProcess());
            }

            Process p = scheduler.getProcessToRun();
            cpu.run(p);

            --cyclesToSimulate;
            System.out.println("CYCLES REMAINING: " + cyclesToSimulate);
        }
    }

    /*
     Generate a processes with a random number of cycyles
     Three types of processes are named
     */
    public Process getRandomProcess()
    {
        Random rand = new Random();

        int numOfCycles = 5 + rand.nextInt(15);
        int typeDecider = rand.nextInt(3);
        Process p;

        if (typeDecider == 0)
        {
            p = new Process("Admin", numOfCycles);
        }
        else
        {
            if (typeDecider == 1)
            {
                p = new Process("System", numOfCycles);
            }
            else
            {
                p = new Process("User", numOfCycles);
            }
        }
        return p;
    }

    public double getNewProcessRate()
    {
        return newProcessRate;
    }

    public void setNewProcessRate(double newProcessRate)
    {
        this.newProcessRate = newProcessRate;
    }

}
