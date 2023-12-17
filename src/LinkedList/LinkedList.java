package LinkedList;

import LinkedList.LinkedList.Node;

public class LinkedList {
    
	public Node head; //Head of list
	
	//Linked list node
	// This inner class is made static
	// so that main() can access it
	static class Node{
		
		int data;
		Node next;
		
		//constructor
		Node(int d)
		{
			data = d;
			next = null;
			
		}
	}
	
	// method to insert a new node
	
	public static LinkedList insert(LinkedList list, int data) {
     // Create a new node with given data
		Node new_node = new Node(data);
		
		//If the linked list is empty, then make the new node as head
		
		if(list.head == null) {
			list.head = new_node;
			
		}else {
			//else traverse till the last node
			// and insert the new_node there
			Node last = list.head;
			while(last.next != null) {
				last = last.next;
				
			}
			//Insert the new_node at last node
			last.next = new_node;
		}
		//Return the list by head
		return list;

}
	//Method to print the linkedlist
	public static void printList(LinkedList list) {
		Node currNode = list.head;
		System.out.print("LinkedList: ");
		
		//Traverse through the LinkedList
		while (currNode != null) {
			//Print the data at current node
			System.out.print(currNode.data + " ");
			// go to next node
			
			currNode = currNode.next;
		}
		
	}
	
	public static void main(String[] args) {
		/* start with the empty list */
		LinkedList list = new LinkedList();
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		
		//print the linkedlist
		
		printList(list);
		
	}
	
}
