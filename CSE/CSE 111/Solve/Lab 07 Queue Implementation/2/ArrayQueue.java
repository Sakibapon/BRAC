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
    public int size(){
      return size;
    }
    public boolean isEmpty(){
      if(size==0){
        return true;
      }
      return false;
    }
    
    public void enqueue(Object o) throws QueueOverflowException{
      if(size==data.length){
        throw new QueueOverflowException();
      }
      else{
        if(size==0){
          data[0]=o;
          size++;
          front=(front+1)%data.length;
          rear=(rear+1)%data.length;
        }
        else{
          data[(rear+1)%data.length]=o;
          rear=(rear+1)%data.length;
          size++;
        }
      }
    }
    public Object dequeue() throws QueueUnderflowException{
      Object ret;
      if(size==0){
        throw new QueueUnderflowException();
      }
      else{
        ret=data[front];
        data[front]=null;
        front=(front+1)%data.length;
        size--;
      }
      return ret;
    }
    
    public Object peek() throws QueueUnderflowException{
      Object see;
      if(size==0){
        throw new QueueUnderflowException();
      }
      else{
        see=data[front];
      }
      return see;
    }
    
    public String toString(){
      String i=" [ ";
      int start=front;
      for(int f=0 ; f<size ; f++){
        i=i+data[start]+" ";
        start=(start+1)%data.length;
      }
      return i+"] ";
    }
    
    public Object[] toArray(){
      Object[] h = new Object[size];
      int u=front;
      for(int p=front ; p<h.length ; p++){
        h[u]=data[u];
        u=(u+1)%data.length;
      }
      return h;
    }
    public int search(Object o){
      int j = front;
      for(int l=0 ; l<size ; l++){
        if(data[j]== o){
          return j;
        }
        else{
          j=(j+1)%data.length;
        }
      }
      return -1;
    }
}