public class ArrayStack{
    int size;
    Node top;
  
    
    public ArrayStack(){
        size = 0;
        top = null;
    }
    
    public int size(){
    int count=0;
    for(Node p=top;p!=null;p=p.next){
    count++;
    }
    return count;
    }
    
    public boolean isEmpty(){
    boolean b=false;
    if(top==null){
    b=true;
    }
    return b;
    }
    
    public void push(Object e)throws StackOverflowException{
    Node n=new Node(e,null);
    if(top==null){
    top=n;
    size++;
    }
    
    else{
    n.next=top;
    top=n;
    size++;
    }
    }
    
    public Object pop() throws StackUnderflowException{
      if(top==null){
      throw new StackUnderflowException();
      }
      else{
      Object o=top.val;
      top=top.next;
      size--;
      return o;
      }
    }
    
    public Object peek() throws StackUnderflowException{
      if(top==null){
      throw new StackUnderflowException();
      }
      else{
      return top.val;
      }
    }
    
    public String toString(){
    String s="";
    for(Node n=top;n!=null;n=n.next){
    s+=n.val+" ";
    }
    if(top==null){
    return (s+"Empty Stack");
    }
    else{
    return s;
    }
    }
    
    public Object[] toArray(){
    Object p[]=new Object[size];
    int pr=0;
    for(Node n=top;n!=null;n=n.next){
    p[pr]=n.val;
    pr++;
    }
    return p;
    }
    
//    public int search(Object e){
//    int i=0;
//    for(Node n=top;n!=null;n=n.next,i++){
//      if(e.equals(n.val)){
//      return i;
//      }
//      
//    }
//    return -1;
//    }
}