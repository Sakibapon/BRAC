
public class task7 {
	public static void main(String[] args) {
		Object[] a={12,54,66,87,15};
		
		Node rHead=LinkedList(a);
		
		rvrsprintLnkLst(rHead);
		
	}
	public static Node LinkedList(Object[] a){
		Node head=new Node(a[0],null);
		Node tail=head;
		
		for(int i=1;i<a.length;i++){
			Node k=new Node(a[i],null);
			tail.next=k;
			tail=k;
		}
		return head;
	}
	
	public static void rvrsprintLnkLst(Node h){
		if(h!=null){			
			rvrsprintLnkLst(h.next);
			System.out.println(h.element);
		}
			
	}
}
