/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16101137
 */
import java.util.Stack;
public class Parentheseschecker {
    private Stack<Object> brackets= new Stack<Object>();
    
    public  void push(char newchar){
      brackets.add(newchar);
    }
    public char pop(){
      char top=(char)brackets.get(brackets.size()-1);
    }
    public void print(){
     for(int i=0;i<brackets.size();i++){
         System.out.println("The Output"+brackets.get(i));
     }
    }
    
}
