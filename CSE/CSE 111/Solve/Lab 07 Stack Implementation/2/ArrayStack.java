public class ArrayStack implements Stack{
    int size;
    int top;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        top =-1;
        data = new Object[5];
    }
    
//  The number of items on the stack
    public int size(){
        return size;
    }
    
//  Returns true if the stack is empty
    public boolean isEmpty(){
        if (size == 0) 
            return true;
        return false;
    }
    
//  Pushes the new item on the stack, throwing the
//  StackOverflowException if the stack is at maximum capacity. It
//  does not throw an exception for an "unbounded" stack, which
//  dynamically adjusts capacity as needed.
    public void push(Object e) throws StackOverflowException{
        if (size == data.length)
            throw new StackOverflowException();
        
        top++;
        data[top] = e;
        size++;
    }
    
//  Pops the item on the top of the stack, throwing the
//  StackUnderflowException if the stack is empty.
    public Object pop() throws StackUnderflowException{
        if (size == 0)
            throw new StackUnderflowException();
        Object temp = data[top];
        data[top] = null;
        size--;
        top--;
        return temp;
    }
    
//  Peeks at the item on the top of the stack, throwing
//  StackUnderflowException if the stack is empty.
    public Object peek() throws StackUnderflowException{
       if (size == 0)
            throw new StackUnderflowException();
        
        return data[top];
    }
    
//  Returns a textual representation of items on the stack, in the
//  format "[ x y z ]", where x and z are items on top and bottom
//  of the stack respectively.
    public String toString(){
        if (size == 0) return "Empty Stack";
        String str = "";
        for (int i = size-1; i >= 0; i--){
            str = str+" "+ data[i];
        }
        return "["+str+" ]";
    }
    
//  Returns an array with items on the stack, with the item on top
//  of the stack in the first slot, and bottom in the last slot.
    public Object[] toArray(){
        Object[] array = new Object[size];
        for (int i = size-1, j = 0; i >= 0; i--,j++){
            array[j] = data[i];
        }
        return array;
    }
    
//  Searches for the given item on the stack, returning the
//  offset from top of the stack if item is found, or -1 otherwise.
    public int search(Object e){
        
        for (int i = size-1, j = 0; i >= 0; i--,j++){
            if (e == data[i]) return j;
        }
        return -1;
    }
}