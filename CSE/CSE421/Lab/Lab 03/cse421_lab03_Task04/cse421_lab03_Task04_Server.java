/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse421_lab03_Task04;
import java.io.*;
import java.net.*;
import java.util.Date;
/**
 *
 * @author Sakib
 */
public class cse421_lab03_Task04_Server 
{
    public static void main(String[] args){
    while(true){
      try{
        ServerSocket ss = new ServerSocket(7777);
        System.out.println("Server is running at port : 7777");
        Socket socket = ss.accept();
        System.out.println("Client is connected");
        
        InputStreamReader input = new InputStreamReader(new DataInputStream(socket.getInputStream()));
        BufferedReader reader = new BufferedReader(input);
        
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        PrintWriter writer = new PrintWriter(output,true);
        String operator=reader.readLine();
        double num1=Integer.parseInt(reader.readLine());
        double num2=Integer.parseInt(reader.readLine());
        double result=0;
        if(operator.equals("+"))
          result=num1+num2;
        else if(operator.equals("-"))
                  result=num1-num2;
        else if(operator.equals("*"))
          result=num1*num2;

        
        writer.println(result);
        ss.close(); 
        }
        

      catch(Exception e){
        System.out.println(e);
      }
    }
  }
    
}
