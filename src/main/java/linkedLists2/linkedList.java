package linkedLists2;



class Node {
    int data;
    Node next;

    public Node(int data){
        this.data= data;
        this.next = null;
    }
}
public class linkedList {
    private Node head;

    public linkedList(){
        this.head = null;
    }

    public void add(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else {

            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }

    public void display(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node current = head;

        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        linkedList link_list = new linkedList();
        link_list.add(1);
        link_list.add(2);
        link_list.add(5);
        link_list.add(4);
        link_list.display();
    }
}
