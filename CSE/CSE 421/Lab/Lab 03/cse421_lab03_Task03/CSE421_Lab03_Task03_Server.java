/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse421_lab03_Task03;

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
public class CSE421_Lab03_Task03_Server 
{
    public static void main(String[] args){
	try 
        {
            while (true) 
            {
		ServerSocket ss = new ServerSocket(7777);
		System.out.println("We are Trying ");
		Socket socket = ss.accept();
		System.out.println("I am visible because a connection is made");

		ServerThread serverThread = new ServerThread(socket);
		serverThread.start();
				

		ss.close();
            }

	} 
        catch (Exception e)
        {
            System.out.println("server connection failed " + e);
	}

	}
}

