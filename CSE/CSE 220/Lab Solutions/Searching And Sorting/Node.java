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
public class Node
{
    int element;
    Node next;
    Node prev;
    
    public Node(int e, Node n)
    {
        element = e;
        next = n;
    }
    public Node(int e, Node n, Node p)
    {
        element = e;
        next = n;
        prev = p;
    }
}