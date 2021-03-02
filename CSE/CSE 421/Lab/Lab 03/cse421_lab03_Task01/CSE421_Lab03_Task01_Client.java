/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse421_lab03_Task01;
import java.io.*;
import java.net.*;
import java.util.Date;
/**
 *
 * @author Sakib
 */
public class CSE421_Lab03_Task01_Client {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[])
    {
    try
        {
          Socket s = new Socket("localhost",7777);
          InputStreamReader input = new InputStreamReader(new DataInputStream(s.getInputStream()));

          BufferedReader reader = new BufferedReader(input);
          System.out.println("response : "+reader.readLine());
          s.close();
        }
    catch(Exception e) 
    {
        System.out.println(e);
    }
    
  }
}
