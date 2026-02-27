class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveDuplicatesFromSortedList {

    // Function to remove duplicates
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // duplicate found → skip next node
                current.next = current.next.next;
            } else {
                // move to next node
                current = current.next;
            }
        }
        return head;
    }

    // Function to print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create sorted linked list: 1 → 1 → 2 → 3 → 3
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(3);

        // Link nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.print("Original List: ");
        printList(n1);

        // Remove duplicates
        ListNode result = deleteDuplicates(n1);

        System.out.print("After Removing Duplicates: ");
        printList(result);
    }
}
