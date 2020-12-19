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
public class CSE421_Lab03_Task02_Client 
{
    public static void main(String args[]){
    try{
      Socket s = new Socket("localhost",7777);
      InputStreamReader input = new InputStreamReader(new DataInputStream(s.getInputStream()));
      BufferedReader reader = new BufferedReader(input);
      
      

      DataOutputStream output = new DataOutputStream(s.getOutputStream());
      PrintWriter writer = new PrintWriter(output,true);
      
      Scanner sc = new Scanner(System.in);
      boolean flag=true;
      do{
        String str = sc.nextLine();
        writer.println(str);
        String response= reader.readLine();
        System.out.println("from server :" + response);
        if(response.equalsIgnoreCase("goodbye")){
          flag=false;
        }
      }while(flag==true);
      s.close();
    }
    
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
