package com.practice.linkedlist;


//Reverse the linked list 

public class ReverseLinkedList
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
public void reverse()
{
   // add code here
  Node node = head;
  Node rev = new Node(node.data);
  

   while (node.next != null) {
   node = node.next;
   Node newNode = new Node(node.data);
   newNode.next = rev;
   rev = newNode;
   }
   
   print(rev);
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
ReverseLinkedList list = new ReverseLinkedList();
list.push(5);
list.push(6);
list.push(14);
list.push(1);
System.out.println("Original LL : ");
list.print(list.head);
System.out.println("Reverse LL : ");

list.reverse();
}
}
