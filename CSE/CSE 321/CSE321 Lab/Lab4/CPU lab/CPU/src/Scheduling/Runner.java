package Scheduling;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    List<Process> PList = new ArrayList<Process>();
    int n=0;
    
    public void InputValue()
    {
         System.out.println("Select Number of Process:");
         System.out.println("Process Time:");  
         //Take all process, Their Time
    }
    public void ProcessRun() throws InterruptedException
    {
        //calculate the WaitT   StartT   EndT for process
    }
    public void PrintResult()
    { 
        System.out.println("------------------------------------");
        System.out.println("Id   Time   WaitT   StartT    EndT");
        System.out.println("------------------------------------");
    }
}
