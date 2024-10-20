import java.util.ArrayList;
import java.util.List;

public class LessThanTarget {
    public static void main(String[] args) {
        Node head = new Node(23);
        head.next = new Node(54);
        head.next.next = new Node(10);
        head.next.next.next = new Node((float)8.5);
        head.next.next.next.next = new Node(-92);
        head.next.next.next.next.next = new Node(40);
        head.next.next.next.next.next.next = new Node(71);
        int target=40;

        Node result = listLessThanTarget(head, target);
        while(result!=null){
            System.out.println(result.data);
            result=result.next;
        }
    }

    public static Node listLessThanTarget(Node head, float target) {
        if(head==null)
            return null;

        Node temp = new Node(0);
        Node current = temp;

        while(head!=null){
            if(head.data<=target){
                current.next = new Node(head.data);
                current = current.next;
            }
            head = head.next;
        }
        return temp.next;
    }

}
