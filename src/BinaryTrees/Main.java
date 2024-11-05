package BinaryTrees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.populate(new int[]{1,2,3,4,5,6,7,8});
        BinarySearchTree bstbal = new BinarySearchTree();
        bstbal.populateSorted(new int[]{1,2,3,4,5,6,7,8,9}, 0, 9);
        bst.display();
        System.out.println(bst.balanced());
        bstbal.display();
        System.out.println(bstbal.balanced());
        bstbal.preOrder();
        System.out.println();
        bstbal.inOrder();
        System.out.println();
        bstbal.postOrder();
    }
}
