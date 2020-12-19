/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse421_lab03_Task03;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.in;
import java.net.*;
/**
 *
 * @author Sakib
 */
public class CSE421_Lab03_Task03_Client
 {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 7777);

			InputStreamReader input = new InputStreamReader(new DataInputStream(s.getInputStream()));
			BufferedReader read = new BufferedReader(input);

			DataOutputStream docs = new DataOutputStream(s.getOutputStream());
			PrintWriter writer = new PrintWriter(docs, true);

			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("Say something to Server : ");
				String msg = sc.nextLine();
				writer.println(msg);

				String response = read.readLine();
				System.out.println("Response from server: " + response);
				if (response.equalsIgnoreCase("goodbye")) {
					break;
				}
			}
			sc.close();
			s.close();

		} catch (Exception e) {
			System.out.println("error");
			System.out.println(e);
		}
	}
}
