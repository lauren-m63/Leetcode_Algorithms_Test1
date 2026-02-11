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

im supposed to splice them so just cutting them up and pasting so im not creating new nodes like dont add them to a new list
when sorting just put it in list1

         */

        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));


        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));
                // since it is linnked this is a list of 2 4 and 6 but they are linked via heads so you have to create the node and then connect to that node
        // Merge the lists
        ListNode merged = merge(list1, list2);

        // Print the merged list
        printList(merged);
    }


    /*
    since you are not sorting you are merging you dont use a sorting algorithm
    you are just doing comparisons since they are already sorted but couldnt they be o they are already sorted

    LINKEDLIST-- so annoying
    you never know hte INDEX so you need a variable to keep track of the ndoe you are currenlty on
    you can only move forward with .next so the tracking variable needs to start at nothign and whenever you append something move forward
     */

    //SORTING METHOD
    public static ListNode merge(ListNode list1, ListNode list2) {
        // the listnode represents the hwole list instead of linkedlist its just the first node and then its the whoel list because the rest of the nodes are connected to the head
        // thats why its declared crazy above because they are really just one node which is the hwole list
/*
im using the fakehead as a starting point -1 and attatching the nodes via tracker which moves forward as i add things
while the fakehead does not move at all it stays just a node
but when i edit tracker i am actually editing fakehead since tracker is pointing to fakehead
 */
        ListNode fakeHead = new ListNode(-1); // just the fake head because you dont know hwether the head will come from list1 or 2 and its null - then later ill just not use this and the new merged list will start at 0 becasue this one is -1
        ListNode tracker = fakeHead; // to see what 'index' im on so i can point from the tracker (last one added) to the next node im going to add- this is the last node added so the next one can be atttached to this one

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {  // .val used for value stored in the node -- comparing values in current nodes
                // is the value in 1 is smaller than in 2 i want to append it to the fakehead which is kept by the tracker, tracker starts at -1 and you want it to keep moving up so after i append something to tracker.next i want to move it to tracker.next again
                tracker.next = list1;
                list1 = list1.next; //my fakeheads actual value is going to stay -1 but im making it fakehead.next so it points to the node after fakehead wait but im not even using fakehead here
            }  else {
                tracker.next = list2; // the next node is list2 in tracker which adds it to fakehead
                list2 = list2.next;
            }// end else if
            tracker = tracker.next; // moving forward after appending a node so we attatch the next node we find to the next one whatever



        } // end while loop


        return fakeHead; // return fakehead which has my new list with all the merged nodes
    } // END METHOD MERGETWO

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