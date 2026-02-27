class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class CycleStart {

    public static ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {   // cycle found

                // Step 2: find cycle start
                ListNode entry = head;

                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }

                return entry; // cycle start
            }
        }

        return null; // no cycle
    }

    public static void main(String[] args) {
        // 1 → 2 → 3 → 4 → 5
        //      ↑         ↓
        //      ← ← ← ← ←
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n3; // cycle start

        ListNode cycleNode = detectCycle(head);
        System.out.println(cycleNode.val); // 3
    }
}
