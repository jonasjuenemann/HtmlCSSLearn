

public class LinkedList {
    public static Node head;

     static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }

         public int getData() {
                return data;
         }
     }

    /* Function to reverse the linked list */
    Node reverse(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next; //current.next im ersten Fall die 15 (in head gegeben),                                    dann die 4
            current.next = prev; //current.next wird auf prev gesetzt (Richtungsänderung in der Liste)                      Richtungsänderung
            prev = current;     //prev wird jetzt die current (85)                                                          15
            current = next;     //current wird auf next gesetzt (also auf 15 (s. oben) gesetzt), also den nächsten Knoten   4
        }
        head = prev;
        return head;
    }

    // prints content of double linked list
    public void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}

