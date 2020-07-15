public class ArrayQueue implements Queue{
    int size;
    int front;
    int rear;
    Object [] data;
    
    public ArrayQueue(){
        size=0;
        front = -1;
        rear = -1;
        data = new Object[5];
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
        try{
            if(size==0){
                data[0]=o;
                size++;
                front=0;
                rear=0;
            }
            else{
                if(size<data.length){
                    data[(rear+1)%data.length]=o;
                    rear=(rear+1)%data.length;
                    size++;
                }
                else{
                    throw new QueueOverflowException();
                }
            }
        }catch(QueueOverflowException q){
            System.out.println("Sorry, Queue Overflow Exception");
        }
    } 
    
// Removes the item in the front of the queue, throwing the 
// QueueUnderflowException if the queue is empty.
    public Object dequeue() throws QueueUnderflowException{
        Object temp=null;
        try{
            if(size==0){
                throw new QueueUnderflowException();
            }
            else{
                temp=data[front];
                size--;
                data[front]=null;
                front=(front+1)%data.length;
                return temp;
            }
        }catch(QueueUnderflowException q){
            System.out.println("Sorry, Queue Underflow Exception");
            return temp;
        }
    }

// Peeks at the item in the front of the queue, throwing
// QueueUnderflowException if the queue is empty.
    public Object peek() throws QueueUnderflowException{
        Object temp=-1;
        try{
            if(size==0){
                throw new QueueUnderflowException();
            }
            else{
                temp=data[front];
                return temp;
            }
        }catch(QueueUnderflowException q){
            System.out.println("Sorry Queue Underflow Exception");
            return temp;
        }
    }

// Returns a textual representation of items in the queue, in the
// format "[ x y z ]", where x and z are items in the front and
// back of the queue respectively.
    public String toString(){
        String st="[";
        int temp=front;
        for(int count=0; count<size; count++){
            if(count==size-1){
                st=st+data[temp]+" ]";
            }
            else{
                st=st+" "+data[temp]+" ";
            }
            temp=(temp+1)%data.length;
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
        int temp=front;
        for(int count=0; count<size; count++){
            array[count]=data[temp];
            temp=(temp+1)%data.length;
        }
        return array;
    }

// Searches for the given item in the queue, returning the
// offset from the front of the queue if item is found, or -1
// otherwise.
    public int search(Object o){
        int temp=front;
        int pos=0;
        for(int count=0; count<size; count++){
            if(data[temp]==o){
                return pos;
            }
            pos++;
            temp=(temp+1)%data.length;
        }
        return -1;
    }
}