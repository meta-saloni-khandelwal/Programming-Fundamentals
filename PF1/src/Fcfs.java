/**
 * Class name-Fcfs
 * 
 * @version 1.0
 * @author Saloni
 */

/*
 * A class to implement First Come First Serve Scheduling
 */
public class Fcfs
{
	int [][]fcfs( int arrival_time[], int job_size[] )
	{
		/*
		 * Below function finds the waiting time for all the processes.
		 * The function returns the two dimensional array which contains waiting time,
		 * start time and the burst time of each process.
		 * The function calculates waiting time, start time and burst time for each process.
		 */
		int iterator1, iterator2;
		int numberOfJobs = arrival_time.length;		//to store total number of processes
		int[][]fcfs = new int[numberOfJobs][5];
		int waiting_time = 0, starting_time = 1, burst_time = job_size[0];		//waiting time of first job is zero
		for(iterator1 = 0; iterator1 < numberOfJobs; iterator1++)
		{
			iterator2 = 0;
			if(starting_time < arrival_time[iterator1])
			{
				starting_time = arrival_time[iterator1];
			}
			burst_time = starting_time + job_size[iterator1]-1;
			waiting_time = starting_time - arrival_time[iterator1];
			fcfs[iterator1][iterator2++] = iterator1+1;
			fcfs[iterator1][iterator2++] = arrival_time[iterator1];
			fcfs[iterator1][iterator2++] = waiting_time;
			fcfs[iterator1][iterator2++] = starting_time;
			fcfs[iterator1][iterator2++] = burst_time;
			starting_time = burst_time + 1;						//start time of process is one more than burst time 
		}
		return fcfs;											//return final 2-D array
	}
}
