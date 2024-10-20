package LinkedListTut;

public class CircularLinkedList {
    Node head;
    Node tail;
    int size;

    public CircularLinkedList() {
        this.head=null;
        this.tail=null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            head.next = tail;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
        size++;
    }


    public void display(){
        System.out.println();
        Node node = head;
        if(head==null)
            return;
        do{
            System.out.print(node.val+" -> ");
            if(node.next!=null){
                node=node.next;
            }
        }while(node!=head);

    }

    public void delete(int val) {
        Node target = getNode(val);
        if (target == null) return; // Node not found

        if (target == head && target == tail) { // Only one node
            head = null;
            tail = null;
        } else if (target == head) { // Head node
            head = head.next;
            tail.next = head;
        } else { // Other nodes
            Node node = head;
            while (node.next != target) {
                node = node.next;
            }
            node.next = target.next;
            if (target == tail) {
                tail = node;
            }
        }
        size--;
    }

    public Node getNode(int val){
        Node node = head;
        while(node!=null){
            if(node.val==val)
                return node;
            node=node.next;
        }
        return node;
    }

    public class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }

        Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }
}
