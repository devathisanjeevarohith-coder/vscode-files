// The Node building block using standard video terminology
class Node {
    int data;
    Node next; // Points to the next node in line

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Complete Singly Linked List Implementation
public class SinglyLinkedList {
    Node head; // The starting anchor of our list

    // ==========================================
    // 1. INSERT AT BEGINNING
    // ==========================================
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        
        // Point our new node's next link to the current head
        newNode.next = head; 
        
        // Move the head pointer to anchor on our new node
        head = newNode;      
    }

    // ==========================================
    // 2. INSERT AT END
    // ==========================================
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // If the list is empty, our new node becomes the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Bro Code style: Use 'current' to traverse the list
        Node current = head;
        while (current.next != null) {
            current = current.next; // Move to the next node
        }

        // Found the last node! Hook up the new node
        current.next = newNode; 
    }

    // ==========================================
    // 3. DELETE AT END
    // ==========================================
    public void deleteAtEnd() {
        // Case 1: Nothing in the list to delete
        if (head == null) {
            System.out.println("The list is empty!");
            return;
        }

        // Case 2: Only one single node exists
        if (head.next == null) {
            head = null; 
            return;
        }

        // Case 3: Multiple nodes exist. Look ahead to find the second-to-last node
        Node current = head;
        while (current.next.next != null) {
            current = current.next; // Hop forward
        }

        // Break the link to the very last node
        current.next = null; 
    }

    // Optional utility method to print out your list to verify it works!
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test everything out
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println("--- Testing Insert at End ---");
        list.insertAtEnd(10);
        list.insertAtEnd(20);   
        list.insertAtEnd(30);
        list.display(); // Output: 10 -> 20 -> 30 -> null

        System.out.println("\n--- Testing Insert at Beginning ---");
        list.insertAtBeginning(5);
        list.display(); // Output: 5 -> 10 -> 20 -> 30 -> null

        System.out.println("\n--- Testing Delete at End ---");
        list.deleteAtEnd();
        list.display(); // Output: 5 -> 10 -> 20 -> null
    }
}