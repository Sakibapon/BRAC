/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Sakib
 */

public class Mainclass 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Array:1 Linked: 2");
        int select=sc.nextInt();
        if(select==1)
        {
    	String expr1=check("1+2*(3/4)");
    	System.out.println("1+2*(3/4) : "+expr1);
    	String expr2=check("1+2*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14");
    	System.out.println("1+2*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14 : "+expr2);
    	String expr3=check("1+2*[3*3+{4–5(6(7/8/9)+10)}–11+(12*8)/{13+13}]+14");
    	System.out.println("1+2*[3*3+{4–5(6(7/8/9)+10)}–11+(12*8)/{13+13}]+14 : " +expr3);
    	String expr4=check("1+2]*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14");
        System.out.println("1+2]*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14 : "+expr4);
        }
        if(select==2)
        {
            String expr1=checkLinked("1+2*(3/4)");
            System.out.println("1+2*(3/4) : "+expr1);
            String expr2=checkLinked("1+2*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14");
            System.out.println("1+2*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14 : "+expr2);
            String expr3=checkLinked("1+2*[3*3+{4–5(6(7/8/9)+10)}–11+(12*8)/{13+13}]+14");
            System.out.println("1+2*[3*3+{4–5(6(7/8/9)+10)}–11+(12*8)/{13+13}]+14 : " +expr3);
            String expr4=checkLinked("1+2]*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14");
            System.out.println("1+2]*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14 : "+expr4);
        }
        else System.out.println("Wrong Input");
     }

	private static String check(String expr) 
	{
            ArrayStack s=new ArrayStack();
            if (expr.isEmpty()) return "This expression is correct.";
		for (int i = 0; i < expr.length(); i++)
		{
                    char c = expr.charAt(i);
			if (c == '{' || c == '(' || c == '[')
			{
                            s.push(c);
			}
			if (c == '}' || c == ')' || c == ']')
			{
                            if (s.isEmpty())
                            {
				return "This expression is NOT correct.";
                            }
                            char last = (char) s.peek();
                            if (c == '}' && last == '{' || c == ')' && last == '(' || c == ']' && last == '[')
				s.pop();
                            else 
                            return "This expression is NOT correct.";
			 }
		 }
		 return s.isEmpty()?"This expression is correct.":"This expression is NOT correct.";
	}
        
        private static String checkLinked(String expr) 
	{
            
            ListStack s=new ListStack();
            if (expr.isEmpty()) return "This expression is correct.";
		for (int i = 0; i < expr.length(); i++)
		{
                    char c = expr.charAt(i);
			if (c == '{' || c == '(' || c == '[')
			{
                            s.push(c);
			}
			 if (c == '}' || c == ')' || c == ']')
			{
                            if (s.isEmpty())
				return "This expression is NOT correct.";
                            char last = (char) s.peek();
                            if (c == '}' && last == '{' || c == ')' && last == '(' || c == ']' && last == '[')
				s.pop();
                            else 
                            return "This expression is NOT correct.";
			 }
		 }
		 return s.isEmpty()?"This expression is correct.":"This expression is NOT correct.";
	}
   
    }

