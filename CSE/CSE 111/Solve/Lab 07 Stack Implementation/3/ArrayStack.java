package stackimplementation;
public abstract class ArrayStack implements Stack{
    int size;
    int top;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        top =-1;
        data = new Object[5];
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size==0);
    }
  public  void  push(Object x)throws StackOverflowException{
    if(size==data.length){
        throw new StackOverflowException();
    }
    else{
      top++;
      data[top]=x;
    size++;
      }
}
public void pop(Object x)throws StackUnderflowException{
    if (size==0){
        throw  new StackUnderflowException();
    }
    else{
    top--;
    data[top]=null;
    size--;
    }
}
    public Object peek() throws StackUnderflowException{
        if(size==0){
      throw new StackUnderflowException();
    }
    return data[top];
    }
    public String toString(){
    if(size==0){
      return "Empty Stack";
    }
    String s=" [ ";
    for(int i=top;i>=0;i--){
      s=s+data[i]+" ";
    }
    s=s+"] ";
    return s;
  }
    public Object[] toArray(){
    Object[] a= new Object[size];
    int k=0;
    for(int i=top;i>=0;i--){
      a[k]=data[i];
      k++;
    }
    return a;
  }
    public int search(Object e){
       int j=0;
        for(int i=top; i>=0; --i){
            if(e.equals(data[i])){
                return j;
            }
            ++j;
        }
        
        return -1;
    }
}