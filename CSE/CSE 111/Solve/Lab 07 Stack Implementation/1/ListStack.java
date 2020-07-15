package lab08;
public  class ListStack implements Stack{
    int size;
    Node top;
  
    
    public ListStack(){
        size = 0;
        top = null;
    }
     public int size(){
    
      return size;
    }
public boolean isEmpty(){
    return (top==null);
    }
public void push(Object e) throws StackOverflowException{
      
        if(size==0){
        top=new Node(e,null);
        }
        else{
        Node n=new Node(e,top);
        top=n;
        }
        size++;
      }
public Object pop() throws StackUnderflowException{
if(size==0||top==null){
    throw new StackUnderflowException();
}
else{
    Object temp= top.val;
      top= top.next;
      size--;
      return temp;
}
}
 public Object peek() throws StackUnderflowException{
 if(size==0){
      throw new StackUnderflowException();
    }
    return top.val;
}
 public String toString(){
      if(size==0||top==null){
      return "Sorry Stack is Empty";
      }
      String s=" [ ";
      for (Node mn=top;mn!=null;mn=mn.next){
      s=s+mn.val+" ";
    }
      s=s+"] ";
      return s;
    }
 public Object[] toArray(){
      Object[] temp= new Object[size];
    int i=0;
    for(Node n=top;n!=null;n=n.next){
    temp[i]=n.val;
    i++;
    }
    return temp;
    }
 public int search(Object e){
    int i=0;
    for(Node mn=top;mn!=null;mn=mn.next,i++){
      if(e.equals(mn.val)){
      return i;
      }
    }
      return -1;
    }
}
      
    
