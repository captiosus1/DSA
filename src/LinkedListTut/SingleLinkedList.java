package LinkedListTut;

public class SingleLinkedList {
    Node head;
    Node tail;
    private int size;

    public SingleLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if (tail == null)
            tail = head;

        size += 1;
    }

    public void insertEnd(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        size += 1;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("END\n");
    }

    public void addAtIndex(int val, int index) {
        if (index == 0){
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertEnd(val);
            return;
        }

        Node temp = head;
        while (index > 1 && index < size) {
            temp = temp.next;
            index--;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void addAtIndexRec(int val, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        head = addAtIndexRecurssion(val, index, head);
        size++;
    }

    private Node addAtIndexRecurssion(int val, int index, Node current) {
        if (index == 0) {
            Node newNode = new Node(val);
            newNode.next = current;
            return newNode;
        }
        if (current == null) {
            throw new IndexOutOfBoundsException();
        }
        current.next = addAtIndexRecurssion(val, index - 1, current.next);
        return current;
    }

    public int deleteFirst() {
        int val = head.data;
        head = head.next;
        if (head == null)
            tail = null;
        size--;
        return val;
    }

    public int deleteLast() {
        if (tail == null)
            return 0;
        int val = tail.data;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public int deleteIndex(int index) {
        if (index == 0)
            return deleteFirst();
        Node temp = head;
        while (index > 1 && index < size) {
            temp = temp.next;
            index--;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    public Node deleteNode(Node head, int val) {
        if (head == null) return null;
        if (head.data == val) {
            return head.next;
        }
        Node node = head;
        while (node.next != null) {
            if (node.next.data == val) {
                node.next = node.next.next;
                return head;
            }
            node = node.next;
        }
        return head;
    }

    public Node get(int index) {
        Node temp = head;
        while (index > 0) {
            temp = temp.next;
            index--;
        }
        return temp;
    }

    public Node find(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public int findLengthofCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {  // Cycle detected
                // Count the length of the cycle
                Node temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;  // No cycle
    }

    public Node firstCycleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
               slow=head;
               while(slow!=fast){
                   fast = fast.next;
                   slow = slow.next;
               }
               return slow;
            }
        }
        return null;
    }

    public Node findFirstCyclenode(Node head){
        Node fast = head;
        Node slow = head;
        int length = findLengthofCycle(head);
        if(length==0){
            return null;
        }
        while (length>0){
            slow = slow.next;
            length--;
        }
        while (fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static class Node {
        int data;
        Node next;
        Node(int val) {
            this.data = val;
            this.next = null;
        }

        Node(int val, Node next) {
            this.data = val;
            this.next = next;
        }
    }
}
