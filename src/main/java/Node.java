public class Node {
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    private Node head;

    public LinkedList(){
        this.head=null;
    }

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd (int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }
        else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.insertAtEnd(3);
        list.printList();  // Output: 2 -> 1 -> 3 -> null
       // list.deleteFromBeginning();
        list.printList();  // Output: 1 -> 3 -> null
    }
}
