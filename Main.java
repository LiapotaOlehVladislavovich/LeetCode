import reverse_linked_list_206.ListNode;
import reverse_linked_list_206.Solution;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
        ListNode test = new Solution().reverseList(head);
    }
}
