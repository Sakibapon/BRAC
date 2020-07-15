public class ListQueue implements Queue{
    int size;
    Node front;
    Node rear;
    
    
    public ListQueue(){
        size = 0;
        front = null;
        rear = null;
    }
    
//TO DO
// The number of items in the queue
    public int size(){
        return size;
    }
    
// Returns true if the queue is empty
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        else{
            return false;
        }
    } 
    
// Adds the new item on the back of the queue, throwing the
// QueueOverflowException if the queue is at maximum capacity. It
// does not throw an exception for an "unbounded" queue, which 
// dynamically adjusts capacity as needed.
    public void enqueue(Object o) throws QueueOverflowException{
        if(size==0){
            Node nN=new Node(o,null);
            size++;
            front=nN;
            rear=nN;
        }
        else{
            Node nN=new Node(o,null);
            size++;
            rear.next=nN;
            rear=nN;
        }
    } 
    
// Removes the item in the front of the queue, throwing the 
// QueueUnderflowException if the queue is empty.
    public Object dequeue() throws QueueUnderflowException{
        Node temp=null;
        try{
            if(size==0){
                throw new QueueUnderflowException();
            }
            else{
                temp=front;
                front=front.next;
                temp.next=null;
                size--;
                return temp.val;
            }
        }catch(QueueUnderflowException q){
            System.out.println("Sorry Queue underflow exception");
            return -1;
        }
    }

// Peeks at the item in the front of the queue, throwing
// QueueUnderflowException if the queue is empty.
    public Object peek() throws QueueUnderflowException{
        Node temp=null;
        try{
            if(size==0){
                throw new QueueUnderflowException();
            }
            else{
                temp=front;
                return temp.val;
            }
        }catch(QueueUnderflowException q){
            System.out.println("Sorry Queue underflow exception");
            return null;
        }
    }

// Returns a textual representation of items in the queue, in the
// format "[ x y z ]", where x and z are items in the front and
// back of the queue respectively.
    public String toString(){
        String st="[";
        Node temp=front;
        for(int count=0; count<size; count++){
            if(count==size-1){
                st=st+temp.val+" ]";
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

// Returns an array with items in the queue, with the item in the
// front of the queue in the first slot, and back in the last slot.
    public Object[] toArray(){
        Object[] array=new Object[size];
        Node temp=front;
        for(int count=0; count<size; count++){
            array[count]=temp.val;
            temp=temp.next;
        }
        return array;
    }

// Searches for the given item in the queue, returning the
// offset from the front of the queue if item is found, or -1
// otherwise.
    public int search(Object o){
        Node temp=front;
        int pos=0;
        for(int count=0; count<size; count++){
            if(temp.val==o){
                return pos;
            }
            temp=temp.next;
            pos++;
        }
        return -1;
    }
}