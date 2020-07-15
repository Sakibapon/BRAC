import java.util.Scanner;
public class Lab08Task09{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the length of the Linked List: ");
        int length=sc.nextInt();
        Node head= new Node(null,0);
        Node temp=head;
        for(int count=0; count<length; count++){
            if(count==0){
                System.out.println("Please enter the value: ");
                head.num=sc.nextInt();
            }
            else{
                System.out.println("Please enter the value: ");
                Node nN=new Node(null,sc.nextInt());
                temp.next=nN;
                temp=temp.next;
            }
        }
        
        System.out.println(print(head));
    }
    
    public static String print(Node n){
        if(n==null){
            return "";
        }
        else{
            return print(n.next)+" "+n.num;
        }
    }
}