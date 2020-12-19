/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse421_lab03_Task02;
import java.io.*;
import java.net.*;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Sakib
 */
public class CSE421_Lab03_Task02_Server 
{
    public static void main(String[] args){
    while(true)
    {
      try
      {
        ServerSocket ss = new ServerSocket(7777);
        System.out.println("Server running at  port : 7777");
        Socket socket = ss.accept();
        System.out.println("Client connected");
        
        InputStreamReader input = new InputStreamReader(new DataInputStream(socket.getInputStream()));
        BufferedReader reader = new BufferedReader(input);
        
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        PrintWriter writer = new PrintWriter(output,true);
        boolean flag=true;
        
        while(flag)
        {
          String client_response=reader.readLine();
          if(client_response.equalsIgnoreCase("End Game"))
          {
            writer.println("Goodbye");
            flag=false;
            break;
          }
          else{
            writer.println(client_response);
          }
          
        }
      
        ss.close();
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      
    }
  }
}
