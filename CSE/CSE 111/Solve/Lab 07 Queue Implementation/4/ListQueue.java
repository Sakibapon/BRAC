package queueimplementation;
public abstract class ListQueue implements Queue{
    int size;
    Node front;
    Node rear;
    
    
    public ListQueue(){
        size = 0;
        front = null;
        rear = null;
    }
   public int size(){
       return size;
   }
   public boolean isEmpty(){
       if (size==0){
           return true;
       }
   return false;
   }
    public void enqueue(Object o) throws QueueOverflowException{
        Node temp=new Node(o,null);
        if(size==0){
           front=temp;
           rear=front;
           size++;
        }
        if(size>0){
            rear.next=temp;
            rear=temp;
            size++;
        }
    }
    public Object dequeue() throws QueueUnderflowException {
            if(size==0){
                throw new QueueUnderflowException();
            }
        Object temp = front.val;
            Node mn = front;
            if(size==1){
                rear=null;
                front=null;
                size--;
            }
            if(size>0){
                front = front.next;
                size--;
            }
            mn.val= null;
            mn.next= null;
            return temp;
    }
    public Object peek() throws QueueUnderflowException {
        if(size==0){
            throw new QueueUnderflowException();
        }
        else{
            return front.val;
        }
        }
 public String toString(){
     String s = " ";
     for(Node n = front; n!=null; n=n.next){
      s = s + n.val+ " ";
     }
     return "[" + s + "]";
    }
 public Object[] toArray() {
     Object a [] = new Object [size];
     int i =0;
     for(Node n = front; n!=null; n=n.next){
      a[i] = n.val;
      i++;
     }
     return a;
        
    }
  public int search(Object o) {
        int b = -1;
     int i = 0;
     for(Node n= front; n!=null; n=n.next){
     if(o.equals(n.val)){
      b= i;
      return b;
     }
     i++;
     }
     return b;
        
    }
}
