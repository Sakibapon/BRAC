/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author 16301203
 */
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Lab08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your input");
    String st=sc.nextLine();
   char[] ch=st.toCharArray();
  int b=st.length();
    Parenthesis(ch,b);
   }
    public static void Parenthesis(char[] s,int c){
       ArrayStack mn=new ArrayStack();
       
       for(int i=0;i<c;i++){
        if(s[i]=='('||s[i]=='['||s[i]=='{'){
            Object x=(Object)s[i];
            try {
                mn.push(x);
            } catch (StackOverflowException ex) {
                Logger.getLogger(Lab08.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
        else{
            Object n=(Object)s[i];
             Object p=null;
          
            try {
                p=mn.pop();
            } catch (StackUnderflowException ex) {
                Logger.getLogger(Lab08.class.getName()).log(Level.SEVERE, null, ex);
            }
        if(s[i]==')'){
            if((char)p!='('){
                
            }
        }
        }
        }
        }
        }
        
    

