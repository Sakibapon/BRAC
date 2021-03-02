/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse421_lab03_Task03;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Sakib
 */
public class ServerThread extends CSE421_Lab03_Task03_Server 
{
	private Socket socket;

	public ServerThread(Socket s) {
		socket = s;
	}

	public void run() {
		try {
			InputStreamReader input = new InputStreamReader(new DataInputStream(socket.getInputStream()));
			BufferedReader read = new BufferedReader(input);

			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			PrintWriter writer = new PrintWriter(dos, true);

			while (true) {
				String msg = read.readLine();
				if (msg.equalsIgnoreCase("end game")) {
					writer.println("goodbye");
					break;
				} else {
					writer.println(msg);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
