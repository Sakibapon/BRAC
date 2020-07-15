package queueimplementation;
public abstract class ArrayQueue implements Queue{
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
      Object mn;
      if(size==0){
        throw new QueueUnderflowException();
      }
      else{
        mn=data[front];
        data[front]=null;
        front=(front+1)%data.length;
        size--;
      }
      return mn;
    }
    public Object peek() throws QueueUnderflowException{
        if(size==0){
            throw new QueueUnderflowException();
        }
        return data[front];
    }
    public String toString(){
      String s=" [ ";
      int st=front;
      for(int i=0 ; i<size ; i++){
        s=s+data[st]+" ";
        st=(st+1)%data.length;
      }
      return s+"] ";
    }
    public Object[] toArray(){
      Object[] temp = new Object[size];
      int m=front;
      for(int n=front ; n<temp.length ; n++){
        temp[m]=data[m];
        m=(m+1)%data.length;
      }
      return temp;
    }
     public int search(Object o){
      int i = front;
      for(int j=0 ; j<size ; j++){
        if(data[i]== o){
          return i;
        }
        else{
          i=(i+1)%data.length;
        }
      }
      return -1;
    }
}