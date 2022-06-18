// Time Complexity : insert and print both have o(n) since we are interating over whole linkedlist for any operations
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes, had to change the class to LinkedList1 since its already there in compilation unit of leetcode compiler.
// approach : for insert create new node add to list at the end(make it head if list is empty). For print, travese whole list starting from head and print data for each node.
import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            //Write your code here 
        	this.data =d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
    	Node newNode = new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 
    	 if(list.head == null)
         	list.head = newNode;
    	 else {
    		 Node temp = list.head;
    		 while(temp.next != null) {
    			 temp =temp.next;
    		 }
    		 temp.next = newNode;
    	 }
    	
            // Insert the new_node at last node 
        // Return the list by head 
    	 return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
    	if(list != null) {
	    	Node temp = list.head;
	    	while(temp != null) {
	    		System.out.println("List data : " + temp.data);
	    		temp = temp.next;
	    	}
    	}
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}
