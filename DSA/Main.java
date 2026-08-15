class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Main{
    Node head;
    public void insertAtBeginning(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
    public void insertAtEnd(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
    }
    public void deleteAtEnd(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }
    public void display(){
        Node current = head;
        System.out.print("Linked List: ");
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        //Singly Linked List
        Main list = new Main();
        int[] a = {1,2,3,4,5,6};
        for(int num : a) {
            list.insertAtEnd(num);
        }
        list.insertAtEnd(3);
        list.display();
    }
}