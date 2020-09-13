/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse220lab05;
/**
 *
 * @author Sakib
 */
public class Task04SelectionSortLinkedList
{
    public static void main (String[]args)
    { 
        Node head = new Node(4,null);
        Node a = new Node(433,null);
        head.next = a;
        Node b = new Node(6,null);
        a.next = b;
        Node c = new Node(342,null);
        b.next = c;
        Node d = new Node(52,null);
        c.next = d;
        Node e = new Node(47,null);
        d.next = e;
        Node f = new Node(70,null);
        e.next = f;
        Node g = new Node(80,null);
        f.next = g;
        Node h = new Node(10,null);
        g.next = h;
        Node i = new Node(30,null);
        h.next = i;
        Node j = new Node(50,null);
        i.next = j;
        Node k = new Node(100,null);
        j.next = k;
        SelectionSort(head);
      
    }
    public static void print(Node head)
    {
        System.out.println("Selection Sort Linked List:");
        for(Node print = head ; print!=null ; print = print.next) System.out.print(print.element+" ");
    }
    public static void SelectionSort(Node head)
    {
        for (Node A = head; A.next != null; A=A.next)
        {  
            Node idx = A;  
            for (Node B = A.next; B!=null; B=B.next)
            {  
                if (B.element < idx.element)idx =B;   
            }  
            int temp = idx.element;   
            idx.element = A.element;  
            A.element = temp;  
        } 
        print(head);
  }
}