package LinkedListTut;


import java.awt.*;
import java.util.Map;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();
        list.addAtIndex(10,0);
        list.addAtIndex(20,1);
        list.addAtIndex(30,2);
        list.addAtIndex(50,3);
        list.addAtIndex(60,4);
        list.addAtIndex(70,5);
        list.addAtIndex(80,6);
        list.addAtIndex(90,7);
        list.get(7).next=list.get(6);
//        list.display();

        System.out.println(list.firstCycleNode(list.head).data);
        System.out.println(list.findFirstCyclenode(list.head).data);
//        DoublyLinkedList list = new DoublyLinkedList();
//        list.insertFirst(5);
//        list.insertFirst(10);
//        list.insertLast(1);
//        list.addAtIndex(45, 1);
//        list.insertAfterNode(list.head.next, 589);
//        list.display();
//        list.displayReverse();
//        SingleLinkedList list = new SingleLinkedList();
//        list.insertFirst(5);
//        list.insertEnd(6);
//        list.insertEnd(8);
//        list.insertEnd(9);
//        list.insertEnd(45);
//        list.addAtIndex(10, 4);
//        System.out.println(list.get(5).data);
//        list.printList(list.head);
//
//        CircularLinkedList circ = new CircularLinkedList();
//        circ.insert(5);
//        circ.insert(10);
//        circ.insert(15);
//        circ.insert(20);
//        circ.display();
//        circ.delete(5);
//        circ.display();
    }
}
