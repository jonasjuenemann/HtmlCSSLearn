import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListLearn {
    // Takes a linkedlist as a parameter and returns a reversed linkedlist
    public static java.util.LinkedList<String> reverseLinkedList(java.util.LinkedList<String> llist) //O(n)??? vllt. durch LLOperatoren höher, Time und Space
    {
        java.util.LinkedList<String> revLinkedList = new java.util.LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {   //O(n)

            // Append the elements in reverse order
            revLinkedList.add(llist.get(i));            //O(n)
        }
        // Return the reversed Linkedlist
        return revLinkedList;
    }


    public static java.util.LinkedList<Integer> reverseLinkedList2(java.util.LinkedList<Integer> llist) //O(n/2)Time??? vllt. durch LLOperatoren höher, O(1) Space
    {
        for (int i = 0; i < llist.size() / 2; i++) {
            Integer temp = llist.get(i);
            llist.set(i, llist.get(llist.size() - i - 1));  // Setze first(i) = Last , wobei first vorher gestored wurde und jetzt Last ist.
            llist.set(llist.size() - i - 1, temp);
        }

        // Return the reversed Linkedlist
        return llist;
    }

    //Dasselbe für ein ArrayList Aber
    public static ArrayList<String> reverseArrayList(ArrayList<String> llist) //O(n)??? vllt. durch LLOperatoren höher
    {
        ArrayList<String> revArrayList = new ArrayList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {   //O(n)

            // Append the elements in reverse order
            revArrayList.add(llist.get(i));            //O(n)
        }
        // Return the reversed arraylist
        return revArrayList;
    }

    public static void main(String[] args)
    {
        // Declaring linkedlist without any initial size
        java.util.LinkedList<String> linkedli = new java.util.LinkedList<String>();
        // Appending elements at the end of the list
        linkedli.add("Cherry");
        linkedli.add("Chennai");
        linkedli.add("Bullet");
        System.out.print("Elements before reversing: " + linkedli);
        linkedli = reverseLinkedList(linkedli);
        System.out.print("\nElements after reversing: " + linkedli);
    }
    }
