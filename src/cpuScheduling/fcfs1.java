package cpuScheduling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Given N processes with their Arrival Time as at[] and Burst Time as bt[].
 * The task is to find the Waiting Time for each processes and
 * Average Waiting Time using First Come First Serve(FCFS) algorithm.
 *
 * Time Complexity - O(n)
 */
public class fcfs1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] at = new int[n];
//        int[] bt = new int[n];
        int n = 5;
        int[] at = {0,1,2,3,4};
        int[] bt = {4,3,1,2,5};
//        String[] arrival = br.readLine().split(" ");
//        String[] burst = br.readLine().split(" ");
//        for (int i = 0; i < n; i++) {
//            at[i] = Integer.parseInt(arrival[i]);
//            bt[i] = Integer.parseInt(burst[i]);
//        }

        int[] wt = waitTime(at,bt,n);
        float waitTime = 0;
        System.out.print("P.No.\tArrival Time\t"+ "Burst Time\tWaiting Time\n");
        System.out.print("1"+ "\t\t\t" +  at[0]+ "\t\t\t"+ bt[0]+ "\t\t\t" +  wt[0] +"\n");
        for(int i = 0; i< n; i++){
            waitTime += wt[i];
            System.out.print(i + 1+ "\t\t\t" +  at[i] + "\t\t\t" +  bt[i]+ "\t\t\t" + wt[i] +"\n");
        }
        System.out.println();
        System.out.println("Average Wait Time:"+ (waitTime/n));
        br.close();
    }

    //function to calculate wait time for each process
    static int[] waitTime(int[] at, int[] bt, int n){
        int[] wt = new int[n];
        wt[0] = 0;
        for (int i = 1; i < n; i++) {
            wt[i] = (at[i-1]+bt[i-1]+wt[i-1])-at[i];
        }
        return wt;
    }

}
/**
 * First Come First Serve (FCFS): Simplest scheduling algorithm that schedules according to arrival times of processes.
 * First come first serve scheduling algorithm states that the process that requests the CPU first is allocated the CPU first.
 * It is implemented by using the FIFO queue. When a process enters the ready queue, its PCB is linked onto the tail of the queue.
 * When the CPU is free, it is allocated to the process at the head of the queue. The running process is then removed from the queue.
 * FCFS is a non-preemptive scheduling algorithm.
 *
 * Note:First come first serve suffers from convoy effect.
 */