package merge_in_between_linked_lists_1669;

public class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int nextIndex = 1;
        ListNode firstPartNode = list1;

        for (; nextIndex < a; nextIndex++) {
            firstPartNode = firstPartNode.next;
        }

        ListNode secondPartNode = firstPartNode;

        for (; nextIndex <= b + 1; nextIndex++) {
            secondPartNode = secondPartNode.next;
        }

        ListNode mergedPartEndNode = list2;

        while (mergedPartEndNode.next != null){
            mergedPartEndNode = mergedPartEndNode.next;
        }

        firstPartNode.next = list2;
        mergedPartEndNode.next = secondPartNode;

        return list1;
    }
}