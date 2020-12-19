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
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Sakib
 */
public class Homework_Server 
{
    public static void main (String[]args)
    {
        try
        {
        while(true)
        {  
        ServerSocket ss = new ServerSocket(7777);
        System.out.println("Server is connected at 7777");
        Socket socket= ss.accept();
        System.out.println("client has been connected");
        
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        PrintWriter writer = new PrintWriter(output,true);
        
        InputStreamReader input = new InputStreamReader(new DataInputStream(socket.getInputStream()));
        BufferedReader reader = new BufferedReader(input);
        
        while(true)
        {
            String client_response =reader.readLine();
            if(client_response.equalsIgnoreCase("End Game"))
            {
                writer.println("Good Bye");
                break;
            }
            else
            {
                writer.println(client_response.toUpperCase());
            }
        }
        
        
        ss.close();
      }
    }
        catch(Exception e)
        {
            System.out.println(e);
        }
  }
    
}
