public class ListStack implements Stack{
    int size;
    Node top;
    
    public ListStack(){
        size = 0;
        top = null;
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
        if(size==0){
            Node nN=new Node(e,null);
            size++;
            top=nN;
        }
        else{
            Node nN=new Node(e,top);
            size++;
            top=nN;
        }
    }
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
    public Object pop() throws StackUnderflowException{
        Node temp=null;
        try{
            if(size==0){
                throw new StackUnderflowException();
            }
            else{
                temp=top;
                top=top.next;
                temp.next=null;
                size--;
                return temp.val;
            }
        }catch(StackUnderflowException q){
            System.out.println("Sorry Stack underflow exception");
            return temp;
        }
    }
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
    public Object peek() throws StackUnderflowException{
        Node temp=null;
        try{
            if(size==0){
                throw new StackUnderflowException();
            }
            else{
                temp=top;
                return temp.val;
            }
        }catch(StackUnderflowException q){
            System.out.println("Sorry Stack underflow exception");
            return temp;
        }
    }
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
    public String toString(){
        String st="[";
        Node temp=top;
        for(int count=0; count<size; count++){
            if(count==size-1){
                st=st+" "+temp.val+" ]";
            }
            else{
                st=st+" "+temp.val+" ";
            }
            temp=temp.next;
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
        Node temp=top;
        for(int count=0; count<size; count++){
            array[count]=temp.val;
            temp=temp.next;
        }
        return array;
    }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
    public int search(Object e){
        Node temp=top;
        int pos=0;
        for(int count=0; count<size; count++){
            if(temp.val==e){
                return pos;
            }
            temp=temp.next;
            pos++;
        }
        return -1;
    }
}