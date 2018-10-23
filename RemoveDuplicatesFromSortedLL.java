package com.practice.linkedlist;

//Reverse the linked list 

public class RemoveDuplicatesFromSortedLL
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
 Node temp = head;
while(temp.next != null)
{
   if(temp.data == temp.next.data)
   {
       temp.next = temp.next.next;
   }
   else
   {
       temp = temp.next;
   }
}
   print(head);
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
	RemoveDuplicatesFromSortedLL list = new RemoveDuplicatesFromSortedLL();
list.push(5);
list.push(6);
list.push(14);
list.push(14);
list.push(14);
list.push(14);
list.push(1);
list.push(1);
list.push(1);
list.push(1);
System.out.println("Original LL : ");
list.print(list.head);
System.out.println();

System.out.println("After removing duplicates LL : ");
list.removeDuplicates();



}
}
