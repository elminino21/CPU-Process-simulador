/*
Michael Penta
this class drives assigns the scheduler and starts the simulator
*/
package ossimulation;

public class SimulationTester
{
   
    public static void main(String[] args)
    {
        //modify to run your scheduler
       // ProcessScheduler scheduler = new FirstComeFistServeScheduler();
    	//ProcessScheduler scheduler = new ShortestJobNext();
    	ProcessScheduler scheduler = new RoundRobin();
    	
        OSSimulation os = new OSSimulation(scheduler);
        //change the number of cycles
        os.simulate(100);
    } 
}
