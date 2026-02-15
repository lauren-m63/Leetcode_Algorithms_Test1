public class LinkedListCycle_141 {

    /*
    directions

    i hate linked listssss

    given the head of LL determines i there is  acycle in the list wt is cycle
    a cycle is when there is a node in the list that can be reach again if you keep going
    so like if you have a node that has two separate nodes pointing to it instead of hte usual one that is behind ti
    pos is index of node
    the next pointer is connected ?
    pos is the index of the node that the next variable is pointing to
    sp if you hit next then you get the pointer to the next variable in the linked list
    so im on pos and pos.next is the nest one in the linked list
    boolean return

    okay tail is always last node so the next fo rtale should be null
head is pointing at the first one so maybe make fummy head wiht -1 node again

pos is telling you whcih node the tail is pointing at ohhhhh
so if pos is null then no cycle okay so confusing for no reason


so i just need to go through the list and keep track of all the pointer nodes that have happened can i do a double search or is that too much

     */

    public static void main(String[] args) {
       //okay i test in other one its fine
    }// END MAIN

    /*
    im doing the loopign methohd istead o fmy weird way that does not wrok
    so i am going to move them through and if they are the same then they will meet0 what if there are duplicates in the list nah they are nodes so its about the pointers not value
    and it cant skip over bevause even if it misses one time itll just loop until its null or they eventually meet
    if the cycle exists they will meet even if the while loop has to run a sec longer
     */

    public static boolean hasCycle(ListNode head){

        if (head == null){
            return false;
        }

        ListNode first= head;
        ListNode second= head;

//        while (first!=null&& first.next!=null){
//            first =  first.next;
//            second = second.next.next; // sayign this is null so it cant read but it should be out of while but i guess i decalre inside so let me move
//
//            // i put wrong thing in the while loop so now im checking the one its on and the next one to make sure not null then if it finds null it should exit and return false
//            // i dont need to check first.next.next in while loop bevcuase im skipping overnext.next so i only need the 2 so im checking if next exists and then i am moving 2 again from the one i check okay
//            if (first==second){
//                return true;
//            }
//        } // end while loop


        ListNode linear= head;
        ListNode twoahead= head;

        while (twoahead!=null && twoahead.next!=null){
            linear =  linear.next;
            twoahead = twoahead.next.next;

            if (linear==twoahead){
                return true;
            }
        } // end while loop



        return false;

    } // end hasCycle method


}// LAST BRACKET
