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

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(size==0){
                return true;
            }
            else{
                return false;
            }
        
    }

    @Override
    public void enqueue(Object o) throws QueueOverflowException {
        Node mn = new Node(o, null);
        if(size==0){
            front=mn;
            rear=front;
            size++;
        }
        else if(size>0){
            rear.next=mn;
            rear=mn;
            size++;
        }
            
        
       
    }

    @Override
        public Object dequeue() throws QueueUnderflowException {
            if(size==0){
                throw new QueueUnderflowException();
            }
            Object temp = front.val;
            Node rn = front;
            if(size==1){
                front=null;
                rear=null;
                size--;
            }
            if(size>0){
                front = front.next;
                size--;
            }
            rn.val= null;
            rn.next= null;
            return temp;

    }

    @Override
    public Object peek() throws QueueUnderflowException {
        if(size==0){
            throw new QueueUnderflowException();
        }
        else{
            return front.val;
        }

    }
    @Override
    public String toString(){
     String str = " ";
     for(Node n = front; n!=null; n=n.next){
      str = str + n.val+ " ";
     }
     return "[" + str + "]";
    }
    
    @Override
    public Object[] toArray() {
     Object a [] = new Object [size];
     int i =0;
     for(Node n = front; n!=null; n=n.next){
      a[i] = n.val;
      i++;
     }
     return a;
        
    }

    @Override
    public int search(Object o) {
        int offset = -1;
     int i = 0;
     for(Node n= front; n!=null; n=n.next){
     if(o.equals(n.val)){
      offset = i;
      return offset;
     }
     i++;
     }
     return offset;
        
    }
}