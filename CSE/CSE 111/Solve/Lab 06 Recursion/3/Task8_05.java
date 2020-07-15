public class Task8_05 {

 public static int search(Node p, int i, int elem)
 {
  if(p!=null)
  { 
   if((int)p.val==elem)
    return i;
   else
   {
    i++;
    return search(p.next, i, elem);
   }
  }
  return -1;
 }
 
 public static void main(String[] args) {
  Object a[]={10,20,30,40,50};
     Node head=new Node(a[0],null);
     Node tail=head;     
     for(int c=1; c < a.length; c++){
      Node p= new Node(a[c],null);    
      tail.next=p;  
      tail=p;
     }
     tail.next=null;
  System.out.println(search(head, 0, 30));
 }

}
