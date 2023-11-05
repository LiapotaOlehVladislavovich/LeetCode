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
            newNode.prev = null;

            if (head != null) {
                head.prev = newNode;
            }

            head = newNode;
        } else {
            MyNode currentNode = head;

            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }

            newNode.next = currentNode.next;
            newNode.prev = currentNode;
            currentNode.next = newNode;

            if (newNode.next != null) {
                newNode.next.prev = newNode;
            }
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

            if (currentNode.next != null) {
                currentNode.next.prev = currentNode;
            }
        }

        size--;
    }

    private static class MyNode {
        private final int val;
        private MyNode next;
        private MyNode prev;

        public MyNode(int val) {
            this.val = val;
            next = null;
            prev = null;
        }
    }
}
