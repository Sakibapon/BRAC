
public class Task9 {
	public static void main(String[] args){
		 System.out.println("---- Linked List aList ----");
	        Object[] a={10,20,30,40,50};
	        LinkedList aList=new LinkedList();
	        aList.add(a,0,5);
	        aList.printList(aList.head);
	        System.out.println();
	        System.out.println("---- size of aList ----");
	        System.out.println(aList.size);
	        
	        System.out.println("In reverse:");
	       reverseList(aList.head);
	       System.out.println();
	}
	
	public static void reverseList(Node head){
		if(head!=null){
			reverseList(head.next);
			System.out.print(head.key+" ");
		}
	}

}
