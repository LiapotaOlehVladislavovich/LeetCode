package design_linked_list_707;

public class MyLinkedList {
    int size;
    private MyNode head;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        MyNode currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }

        MyNode newNode = new MyNode(val);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            MyNode currentNode = head;

            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }

            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }

        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size) {
            return;
        }

        if (index == 0) {
            head = head.next;
        } else {
            MyNode currentNode = head;

            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }

            currentNode.next = currentNode.next.next;
        }

        size--;
    }

    private static class MyNode {
        private final int val;
        private MyNode next;

        public MyNode(int val) {
            this.val = val;
            next = null;
        }
    }
}
