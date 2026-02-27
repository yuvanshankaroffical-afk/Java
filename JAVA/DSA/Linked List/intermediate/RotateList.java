class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RotateList {

    public static ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        // Step 1: find length and tail
        ListNode curr = head;
        int length = 1;

        while (curr.next != null) {
            curr = curr.next;
            length++;
        }
        ListNode tail = curr;

        // Step 2: reduce k
        k = k % length;
        if (k == 0) return head;

        // Step 3: make circle
        tail.next = head;

        // Step 4: find new tail
        int steps = length - k;
        ListNode newTail = head;

        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        // Step 5: break circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    // Main function
    public static void main(String[] args) {

        // 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = rotateRight(head, 2);

        // Print result
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        // Output: 4 5 1 2 3
    }
}
