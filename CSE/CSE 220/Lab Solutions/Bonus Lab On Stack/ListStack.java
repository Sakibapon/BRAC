/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sakib
 */
public class ListStack 
{
    int size;
    Node top;
  
    
    public ListStack()
    {
        size = 0;
        top = null;
    }

    
    public boolean isEmpty() 
    {
        if(size == 0) 
        {
           
            return true;
        }
        else  return false;
    }
    
    public void push(Object e)
    {
        if(top==null)
        {
            top=new Node(e,null);
            size++;
        }
        else
        {
            Node n=new Node(e,null);
            n.next=top;
            top=n;
            size++;
        }
    }
    
    public Object pop() 
    {
        if(size == 0) 
        {
            
        }
        else 
        {
            Object temp = top.val;
            top = top.next;
            size--;
            return temp;
        }
        return null;
    }
    
    public Object peek()
    {
        if(size == 0) 
        {
        }
        else 
        { 
            return top.val;
        }
        return null;
    }
}