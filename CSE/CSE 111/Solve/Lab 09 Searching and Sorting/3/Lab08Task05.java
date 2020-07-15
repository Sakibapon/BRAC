import java.util.Scanner;
public class Lab08Task05{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
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
        System.out.println("Please enter the key to search: ");
        int key=sc.nextInt();
        int count=0;
        
        System.out.println(search(head, key, count));
    }
    public static int search(Node head, int key, int count){
        if(head==null){
            return -1;
        }
        else if(head.num==key){
            return count;
        }
        else{
            head=head.next;
            count++;
            return search(head,key,count);
        }
    }
}