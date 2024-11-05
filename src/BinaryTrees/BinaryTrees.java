package BinaryTrees;

import java.util.Scanner;

public class BinaryTrees {
    private Node root;

    BinaryTrees(){

    }

    public void populate(Scanner sc){
        System.out.println("Please enter the root node for your tree");
        int rootval = sc.nextInt();
        root=new Node(rootval);
        populate(sc, root);
    }

    public void populate(Scanner sc, Node node){
        Node newnode;
        System.out.println("Do you want to add at left?");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the value you want to add at left : ");
            int leftVal = sc.nextInt();
            newnode = new Node(leftVal);
            node.left=newnode;
            populate(sc,newnode);
        }

        System.out.println("Do you want to add at right?");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the value you want to add at right : ");
            int rightVal = sc.nextInt();
            newnode = new Node(rightVal);
            node.right=newnode;
            populate(sc, newnode);
        }
    }

    public void display(){
        prettyDisplay(root, 01);
    }

    public void display(Node node, String indent){
        if(node==null)
            return;

        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay(Node node,int level){
        if(node==null)
            return;

        prettyDisplay(node.right,level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|-------"+node.val);
        }
        else{
            System.out.println(node.val);
        }
        prettyDisplay(node.left,level+1);
    }

    class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val=val;
        }
    }
}
