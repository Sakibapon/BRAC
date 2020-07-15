public class ArrayStack implements Stack{
    int size;
    int rear;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        rear=-1;
        data = new Object[5];
    }
    
    
// The number of items on the stack
    public int size(){
        return size;
    }
// Returns true if the stack is empty
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        else{
            return false;
        }
    }
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
    public void push(Object e) throws StackOverflowException{
        try{
            if(size==0){
                data[0]=e;
                size++;
                rear=0;
            }
            else{
                if(size<data.length){
                    data[(rear+1)%data.length]=e;
                    rear=(rear+1)%data.length;
                    size++;
                }
                else{
                    throw new StackOverflowException();
                }
            }
        }catch(StackOverflowException q){
            System.out.println("Sorry, Stack Overflow Exception");
        }
    }
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
    public Object pop() throws StackUnderflowException{
        Object temp=null;
        try{
            if(size==0){
                throw new StackUnderflowException();
            }
            else{
                temp=data[rear];
                size--;
                data[rear]=null;
                rear=(rear-1)%data.length;
                return temp;
            }
        }catch(StackUnderflowException q){
            System.out.println("Sorry, Stack Underflow Exception");
            return temp;
        }
    }
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
    public Object peek() throws StackUnderflowException{
        Object temp=null;
        try{
            if(size==0){
                throw new StackUnderflowException();
            }
            else{
                temp=data[rear];
                return temp;
            }
        }catch(StackUnderflowException q){
            System.out.println("Sorry Stack Underflow Exception");
            return temp;
        }
    }
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
    public String toString(){
        String st="[";
        int temp=rear;
        for(int count=0; count<size; count++){
            if(count==size-1){
                st=st+" "+data[temp]+" ]";
            }
            else{
                st=st+" "+data[temp]+" ";
            }
            temp--;
        }
        if(size==0){
            return "[ ]";
        }
        else{
            return st;
        }
    }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
    public Object[] toArray(){
        Object[] array=new Object[size];
        int temp=rear;
        for(int count=0; count<size; count++){
            array[count]=data[temp];
            temp--;
        }
        return array;
    }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
    public int search(Object e){
         int temp=rear;
        int pos=0;
        for(int count=0; count<size; count++){
            if(data[temp]==e){
                return pos;
            }
            temp--;
            pos++;
        }
        return -1;
    }
}