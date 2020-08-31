/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sakib
 */
public class ArrayStack
{
	Object[]a;
	int size;
	int capacity=5;
	public ArrayStack()
	{
	    a=new Object[capacity];
	    size=0;
	}
	
	    public boolean isEmpty() 
	    {
	        if (size == 0) 
	        { 
	            return true;
	        }
	        else  return false;
	    }
	
	    public void push(Object e)
	    {
	        if(size==a.length)
	        {
	           
	        }
	        else{
	            a[size]=e;
	            size++;
	            
	        }
	    
	    }
	
	    public Object pop() 
	    {
	        Object val = null;
	        if(size>a.length)
	        {
	            
	        }
	        else
	        {
	            val=a[size-1];
	            a[size-1]=null;
	            size--;
	            
	        }
	        return val;
	    }
	
	    public char peek()//throws StackUnderflowException 
	    {
	        Object val=null;
	        if(size>a.length || size==0)
	        {
	            
	        }
	        else
	        {
	            val=a[size-1];
	           
	        }
			return (char) val;
	   
	    } 
	    
	    
}

    
