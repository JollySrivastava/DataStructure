package com.practice.linkedlist;

import java.util.Iterator;
import java.util.LinkedHashSet;

//Reverse the linked list 

public class RemoveDuplicatesFromLL
{
	Node head;     // head of the linked list
	
	/*
	 * Linked list node
	 */
	class Node
	{
		int data;
		Node next;
		Node (int data)
		{
			this.data = data;
			next = null;
		}
		
	}

/*
* Pushing the data in linked list
*/
public void push(int data)
{
	Node new_data = new Node(data);
	new_data.next = head;
	
	head = new_data;	
}
/**
 * Method to reverse the ll
 */
public void  removeDuplicates()
{
     // Your code here
     LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
     Node temp = head;
     Node restart = head;

     while(temp != null)
     {
         lhs.add(temp.data);
         temp = temp.next;
     }
     
    Iterator<Integer> i = lhs.iterator(); 
    restart.data = i.next();
    while (i.hasNext()) 
    {
        restart = restart.next;
        restart.data = i.next();
    }
    restart.next = null;
    restart = head;
    
    print(restart);
}
public void print(Node head)
{
	Node thead = head;
	while(thead != null)
	{
		System.out.print(thead.data + " ");
		thead = thead.next;
	}
}

public static void main(String argc[])  {
RemoveDuplicatesFromLL list = new RemoveDuplicatesFromLL();
list.push(5);
list.push(6);
list.push(14);
list.push(1);
list.push(1);
list.push(1);
list.push(14);
list.push(14);
list.push(14);
list.push(1);
System.out.println("Original LL : ");
list.print(list.head);
System.out.println();

System.out.println("After removing duplicates LL : ");
list.removeDuplicates();



}
}
