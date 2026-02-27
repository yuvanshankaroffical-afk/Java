class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next =null;
    }
}


public class Example19 {
	public static ListNode removeNthFromNode(ListNode head, int n){
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = head;
        ListNode slow = head;

        for(int i =0; i<=n; i++){
            fast = fast.next;

        }

        while(fast !=null){
            fast=fast.next;
            slow=slow.next;
        }

        slow.next =slow.next.next;
        return dummy.next;

    }
    public static void printlist(ListNode head){
        while(head !=null){
            System.out.print(head.val + "-> ");
            head = head.next;
        }

    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        int n = 2;
        head = removeNthFromNode(head, n);
        printlist(head);
    }
}
