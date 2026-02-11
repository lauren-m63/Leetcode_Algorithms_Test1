// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLists_21 {

    public static void main(String[] args) {


        /*
       You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list.
The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
         */


        /*
        personal notes :

        Inserting element
Create a new node and set its pointer to null since its at the end of the list
Make the last element in current array point to the new node

         */

        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));


        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));
                // since it is linnked this is a list of 2 4 and 6 but they are linked via heads so you have to create the node and then connect to that node
        // Merge the lists
        ListNode merged = mergeTwoLists(list1, list2);

        // Print the merged list
        printList(merged);
    }


    //SORTING METHOD
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {






        return null; // placeholder
    }

    //PRINTING METHOD
    public static void printList(ListNode head) { // prints t he head of the sorted list
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
        // should return 123456 as whole list and then the head would just be 1 right yes because linked list first node is the 1
    }
}