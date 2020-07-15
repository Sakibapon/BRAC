/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class LinkedList {

    public Node head;

    /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
     */
    public LinkedList(Object[] a) {
        // TO DO
        head = new Node(a[0], null);
        Node tail = head;

        for (int i = 1; i < a.length; i++) {
            Node mn = new Node(a[i], null);
            tail.next = mn;
            tail = tail.next;
        }
    }

    /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
     */
    public LinkedList(Node h) {
        // TO DO
        head = h;
    }

    /* Counts the number of Nodes in the list */
    public int countNode() {
        // TO DO
        int count = 0;
        for (Node n = head; n != null; n = n.next) {
            count++;
        }

        return count; // please remove this line!
    }

    /* prints the elements in the list */
    public void printList() {
        // TO DO    
        for (Node n = head; n != null; n = n.next) {
            System.out.print(n.element + " ");
        }
        System.out.println();
    }

    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx) {
        // TO DO
        if (idx < 0) {
            System.out.println("Invalid index" + idx);
            return null;
        }
        Node n = head;
        for (int i = 0; n != null; n = n.next) {
            if (i == idx) {
                return n; //n.element get set
            } else {
                i++;
            }
        }
        System.out.println("Invalid index" + idx); //idx > size
        return null; // please remove this line!
    }

// returns the element of the Node at the given index. For invalid idx return null.
    public Object get(int idx) {
        // TO DO
        Node n = nodeAt(idx);
        if (n == null) {
            return null;
        } else {
            return n.element; // please remove this line!
        }

    }

    /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
     */
    public Object set(int idx, Object elem) {
        // TO DO
        Node n = nodeAt(idx);
        if (n == null) {
            return null;
        } else {
            Object temp = n.element;
            n.element = elem;
            return temp;
            // please remove this line!
        }
    }

    /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem) {
        // TO DO
        int i = 0;
        for (Node n = head; n != null; n = n.next) {
            if (n.element.equals(elem)) {
                return i;
            }
            i++;
        }
        return -1; // please remove this line!
    }

    // returns true if the element exists in the List, return false otherwise.
    public boolean contains(Object elem) {
        // TO DO
        for (Node n = head; n != null; n = n.next) {
            if (n.element.equals(elem)) {
                return true;
            }
        }
        return false; // please remove this line!
    }

    // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
    public Node copyList() {
        // TO DO
        Node cHead = new Node(head.element, null);
        Node cTail = cHead;
        for (Node n = head; n != null; n = n.next) {
            Node k = new Node(n.element, null);
            cTail.next = k;
            cTail = k;
        }
        return cHead;
    }
        // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
    public Node reverseList() {
        Node revHead= new Node(head.element,null);
        for(Node n=head.next;n!=null;n=n.next){
            Node mn=new Node(n.element,null);
            mn.next=revHead;
            revHead=mn;
        }
        return revHead;
    }

    /* inserts Node containing the given element at the given index
   * Check validity of index.
     */
    public void insert(Object elem, int idx) {
       if(idx<0 || idx > countNode()){
           System.out.println("Invalid Index");
       }
       else{
           Node mn=new Node(elem, null);
           if(idx==0){
               mn.next=head;
               head=mn;
           }
           else{
               Node pred=nodeAt(idx-1);
               mn.next=pred.next;
               pred.next=mn;
           }
       }
    }

    /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index) {
        int size = countNode();
        if(index<0||index> (size-1)){
            System.out.println("Invalid Index");
            return null;
        }
        else{
            if(index==0){
                Node removedNode=head;
                Object removedElement = head.element;
                head= head.next;
                
                removedNode.element=null;
                removedNode.next=null;
                return removedElement;
            }
            else{
                Node pred=nodeAt(index-1);
                
                Node removedNode =pred.next;
                Object removedElement= pred.next.element;
                pred.next=pred.next.next;
                
                removedNode.element=null;
                removedNode.next=null;
                return removedElement;
            }
        }
    }

    // Rotates the list to the left by 1 position.
    public void rotateLeft() {
        Node tem = head;
        head = head.next;
        tem.next = null;
        Node n;
        for(n=head; n.next!= null; n= n.next){
        }
        n.next=tem;
    }

    // Rotates the list to the right by 1 position.
    public void rotateRight() {
        Node n = head;
        for(;n.next.next!=null;n=n.next){
        }
        Node tem = n.next;
        n.next = null;
        tem.next= head;
        head = tem;
    }

}
