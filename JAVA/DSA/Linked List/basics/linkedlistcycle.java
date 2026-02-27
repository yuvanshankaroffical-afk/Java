class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class linkedlistcycle {

    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 step
            fast = fast.next.next;    // 2 steps

            if (slow == fast) {
                return true; // cycle detected
            }
        }
        return false; // no cycle
    }

    public static void main(String[] args) {
        // Create nodes
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        // Link nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2; // cycle here 👈

        System.out.println(hasCycle(n1)); // true
    }
}
