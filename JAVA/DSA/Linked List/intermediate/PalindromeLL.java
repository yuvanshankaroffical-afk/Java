class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class PalindromeLL {

    public static boolean isPalindrome(ListNode head) {

        // Step 1: find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: reverse second half
        ListNode prev = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Step 3: compare
        ListNode left = head;
        ListNode right = prev;

        while (right != null) {
            if (left.val != right.val)
                return false;

            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        // 1 → 2 → 2 → 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println(isPalindrome(head)); // true
    }
}
