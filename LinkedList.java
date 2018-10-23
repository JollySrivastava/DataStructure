package com.practice.linkedlist;
//Find the middle element of linkedlist

public class LinkedList
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

public void findMiddleElement()
{
	Node slow_ptr = head;
	Node fast_ptr = head;
	
	if(head!= null)
	{
		while(fast_ptr != null && fast_ptr.next != null)
		{
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}
		System.out.println(slow_ptr.data);
	}
	
}

public void print()
{
	Node thead = head;
	while(thead != null)
	{
		System.out.println(thead.data);
		thead = thead.next;
	}
}
public static void main(String argc[])  {
  LinkedList me = new LinkedList();
  me.push(5);
  me.push(6);
  me.push(14);
  me.push(1);
  me.print();

  me.findMiddleElement();
  
}
}
