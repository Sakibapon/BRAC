/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse220lab05;
import static cse220lab05.Task04SelectionSortLinkedList.print;

/**
 *
 * @author Sakib
 */
public class Task05InsertationDoublyLinked
{  
    public static void main(String[] args) 
    { 
        Node head = new Node(42,null);
        Node a = new Node(433,null,head);
        head.next = a;
        Node b = new Node(64,null,a);
        a.next = b;
        Node c = new Node(342,null,b);
        b.next = c;
        Node d = new Node(52,null,c);
        c.next = d;
        Node e = new Node(47,null,d);
        d.next = e;
        Node f = new Node(70,null,e);
        e.next = f;
        Node g = new Node(10,null,f);
        f.next = g;
        Node h = new Node(30,null,g);
        g.next = h;
        Node i = new Node(50,head,h);
        h.next = i;
        head.prev = i;
        InsertionSort(head); 
    } 
    public static void print(Node head)
    {
        System.out.println("Insertation Sort Dobuly Linked List:");
        for(Node print=head.next;print!=head;print=print.next) System.out.print(print.element+" ");
    }
    public static void InsertionSort(Node head)
    {  
        for (Node A = head.next; A!=head; A=A.next) 
        { 
            int x = A.element;   
            Node B = A.prev;
            for (B = A.prev;B !=head.prev && B.element > x;B=B.prev) 
            { 
                B.next.element = B.element;   
            } 
            B.next.element = x; 
        }
        print(head);
    } 
}