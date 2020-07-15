class Node{
    int val;
    Node next;
    Node(int givenval){
    val = givenval;
    } 
}
    class List{
        int length;
        Node head;
        Node tail;
        void addtoList(int val){
        Node node = new Node(val);
        if(length ==0){
            node.next = null;

        }
        else{
            node.next = head;
        }
        head = node;
        length++;
        }
        public void Print(){
        Node node = head;
        while(node != null){
        System.out.print(node.val+" ");
        node = node.next;
        }
     }
    public void selectionSort(){
         for(Node node1 = head; node1!=null; node1 = node1.next){
         Node min = node1;
         for(Node node2 = node1; node2!=null; node2 = node2.next){
             if(min.val > node2.val){
             min = node2;
             }
         }  
         Node temp = new Node(node1.val);
         node1.val = min.val;
         min.val = temp.val;
         }
    }
    }



