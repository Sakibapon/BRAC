public class Task8_09 {
  public static void reverse(Node p)
  {
    if(p!=null)
    {
      reverse(p.next);
     System.out.print(p.val + " ");
    }
   }    
   public static void main(String[]args)
   {    
    Object p[]={10,20,30,40,50};
       Node head=new Node(p[0],null);
       Node tail=head;      
       for(int c=1;c< p.length;c++)
       {
        Node q= new Node(p[c],null);        
        tail.next=q;        
        tail=q;
       }
       tail.next=null;
    reverse(head);
    System.out.println();
   }
  }
