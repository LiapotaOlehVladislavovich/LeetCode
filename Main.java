import odd_even_linked_list_328.ListNode;
import odd_even_linked_list_328.Solution;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(2,
                new ListNode(1,
                        new ListNode(3,
                                new ListNode(5,
                                        new ListNode(6,
                                                new ListNode(4,
                                                        new ListNode(7)))))));
        ListNode test = new Solution().oddEvenList(head);
    }
}
