/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Sakib
 */
public class Homework_Client 
{
    public static void main (String[]args)
  {
    try
    {
        Socket s = new Socket("localhost",7777);

        

        DataOutputStream output = new DataOutputStream(s.getOutputStream());
        PrintWriter writer = new PrintWriter(output,true);
        
        InputStreamReader input = new InputStreamReader(new DataInputStream(s.getInputStream()));
        BufferedReader reader = new BufferedReader(input);
        
        Scanner sc = new Scanner (System.in);
        while(true)
        {
            System.out.println("Say something to the server");
            String in = sc.nextLine();
            writer.println(in);
            String response = reader.readLine();

            System.out.println("From server  " + response);

            if(response.equalsIgnoreCase("Good Bye"))
               break;
        }
        s.close();
        sc.close();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
  }
    
    
}
