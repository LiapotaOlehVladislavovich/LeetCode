import add_two_numbers_2.ListNode;
import add_two_numbers_2.Solution;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9)))))));
        ListNode l2 = new ListNode(9
                , new ListNode(9
                , new ListNode(9
                , new ListNode(9))));
        ListNode test = new Solution().addTwoNumbers(l1, l2);
    }
}
