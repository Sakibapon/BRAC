public class ArrayStack {
  int size;
  Object [] data;
  
  public ArrayStack(){
    size=0;
    data = new Object[5];
  }
  
  
  public int size(){
    int j=0;
    for(int i=0;i<size;i++){
    j++;
    }
    return j;
    }
  
  public boolean isEmpty(){
    boolean b=false;
    if(size==0){
      b=true;
    }
    return b;
  }
  
  public void push(Object o) throws StackOverflowException{
    if(size>=data.length||size>data.length){
      throw new StackOverflowException();
    }
    else{
      data[size]=o;
      size++;
    }
  }
  
  public Object pop() throws StackUnderflowException{
    int last=size-1;
    if(size==0){
      throw new StackUnderflowException();
    }
    
    else{
      Object o=data[last];
      data [last]=0;
      size--;
      return o;
    }
  }
  
  public Object peek() throws StackUnderflowException{
    int last=size-1;
    if(size==0){
      throw new StackUnderflowException();
    }
    return data[last];
  }
  
  public String toString(){
    String s="";
    for(int i=size-1;i>=0;i--){
      s=s+data[i]+" ";
    }
    if(size==0){
      return (s+"EMPTY STACK");
    }
    else{
      return s;
    }
  }
  
  public Object[] toArray(){
    Object  o[]=new Object[size];
    int pr=0;
    for(int i=size-1;i>=0;i--,pr++){
      o[pr]=data[i];
    }
    return o;
  }
  
  public int search(Object e){
    int o=0;
    for(int i=size-1;i>=0;--i,o++){
      if(e==data[i]){
        return o;
      }
    }
    return -1;
  }
  
}