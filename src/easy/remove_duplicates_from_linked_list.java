package easy;

public class remove_duplicates_from_linked_list {
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

//    public static LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
//        // Write your code here.
//        LinkedList curr = linkedList.next;
//        LinkedList result = linkedList;
//
//        while (curr != null){
//           if (curr.value != result.value) {
//               result.next = curr;
//               result = result.next;
//           }
//            curr = curr.next;
//        }
//
//        result.next = null;
//        return linkedList;
//    }

    public static LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        // Write your code here.
       LinkedList current = linkedList;

       while (current != null){
           LinkedList nextDistinctNode = current.next;

           while (nextDistinctNode != null && nextDistinctNode.value == current.value)
               nextDistinctNode = nextDistinctNode.next;

           current.next = nextDistinctNode;
           current = nextDistinctNode;
       }
        return linkedList;
    }

    public static void printList(LinkedList head){
        LinkedList temp = head;

        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList(1);
        l1.next = new LinkedList(1);
        l1.next.next = new LinkedList(3);
        l1.next.next.next = new LinkedList(4);
        l1.next.next.next.next = new LinkedList(4);
        l1.next.next.next.next.next = new LinkedList(4);
        l1.next.next.next.next.next.next = new LinkedList(5);
        l1.next.next.next.next.next.next.next = new LinkedList(6);
        l1.next.next.next.next.next.next.next.next = new LinkedList(6);

        printList(l1);
        LinkedList l2 = removeDuplicatesFromLinkedList(l1);
        printList(l2);

    }
}
