import remove_linked_list_elements_203.ListNode;
import remove_linked_list_elements_203.Solution;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(6,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5,
                                                        new ListNode(6)))))));
        ListNode test = new Solution().removeElements(head, 6);
    }
}
