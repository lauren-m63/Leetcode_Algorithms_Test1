import java.util.List;

public class SwapNodesInPairs_24 {

    /*
    swap the adjacent ones and only change the value no the node ?

    no im supposed to update POINTERS and leave the values okay

    Given a linked list, swap every two adjacent nodes and return its head.
    You must solve the problem without modifying the values in the list's nodes
    (i.e., only nodes themselves may be changed.)

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

so im going to do a loop and like do the pointers so should ill do a while loop
// wait am i given the yeah im given the hwile list
     */
    public ListNode swapPairs(ListNode head) {
        ListNode headdumb = new ListNode(0);
//        ListNode first = head; // so im starting at listnode[0]- wait should i not start no
//        ListNode second = first.next; //2
//        ListNode third= second.next; //3

        headdumb.next = head;  //the node is literally jus makign node 0 the word dummy and then it makes the next the rest of the list so its pointing to the head hwich is poinitng to eveyrthing else
        ListNode prev = headdumb; // previous is the dumb head so its 0 (headdumb/prev), 1 (head/first/prev.next), 2 (second/first.next),

        // so i want first to point to third and second to point to first and i have to do the nexts
        if (head == null){
            return null;
        }

        while (prev.next != null && prev.next.next != null){ // wait i havr to loop it
//            // first.next = third whcih is the third one
//            first.next = third; // now the first one is pointing to the third
//            second.next = first;
//            first = first.next; // update the new first one to be the head
//            // second.next = first node // this doesnt work because it doesnt actually loop right
//            //continue ?
            ListNode first = prev.next; // this is the first one
            ListNode second = first.next; // this is the second and then later i will update it so it will loop to the next pair after this vibes

            first.next = second.next; // the first one is pointing to the third one
            second.next = first; // second node is pointing to the first node
            prev.next = second; // prev.next which is the head is now the second one so our head is now the second one

            prev = first; // now prev which is the 0 headdumb with nothing is the first one which is the secodn one now since we switched
            // this is how it moves forward because we need to reuse the same varibales
            // so now this works because its going to move like the third one is actually the head but its not hahahahha
        }// end while loop




        return headdumb.next; // skipping my first node which is just the headdumb with nothign its just the head
    }


}
