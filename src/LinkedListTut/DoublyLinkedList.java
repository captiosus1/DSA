package LinkedListTut;

public class DoublyLinkedList {
     Node head;
    int size;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        if(head!=null)
            head.prev=node;
        head=node;
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node tail = getTail();
        if(head==null){
            head=node;
            size++;
            return;
        }
        tail.next=node;
        node.prev=tail;
        size++;
    }

    public void addAtIndex(int val, int index){
        if(index==0)
            insertFirst(val);

        if(index==size)
            insertLast(val);
        Node temp = head;
        while(index>1&&index<size){
            temp=temp.next;
            index--;
        }
        Node node = new Node(val);
        node.next = temp.next;
        node.prev=temp;
        temp.next.prev=node;
        temp.next=node;
        size++;
    }

    public void insertAfterNode(Node node, int val){
        Node temp = new Node(val);
        temp.prev=node;
        temp.next=node.next;
        node.next.prev=temp;
        node.next=temp;
        size++;
    }
    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.val+" -> ");
            node=node.next;
        }
        System.out.print("END");
    }

    public Node getTail(){
        Node node = head;
        if(head==null)
            return null;
        while(node.next!=null){
            node=node.next;
        }
        return node;
    }

    public void displayReverse(){
        Node node = this.getTail();
        System.out.println();
        while(node!=null){
            System.out.print(node.val+" <- ");
            node=node.prev;
        }
        System.out.print("START");
    }

    public class Node{
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}
