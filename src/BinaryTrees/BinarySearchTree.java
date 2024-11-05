package BinaryTrees;

public class BinarySearchTree {

    private Node root;
    BinarySearchTree(){

    }
    public void insert(int val){
        if(root==null)
            root = new Node(val);
        else{
           insert(val, root);
        }
    }

    private void insert(int val, Node node){
        if(val<node.value){
            if(node.left==null){
                node.left = new Node(val);
                return;
            }
            insert(val,node.left);
        }
        if(val>node.value){
            if(node.right==null) {
                node.right = new Node(val);
                return;
            }
            insert(val,node.right);
        }
        node.height = Math.max(height(node.right),height(node.left))+1;
    }

    public void populate(int[] array){
        for(int arr: array){
            insert(arr);
        }
    }

    public void populateSorted(int[] arr, int start, int end){
        if(start>=end)
            return;
        int mid = (start+end)/2;
        insert(arr[mid]);
        populateSorted(arr,start, mid);
        populateSorted(arr,mid+1,end);
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node==null)
            return true;
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        prettyDisplay(root,0);
    }

    public void prettyDisplay(Node node, int level){
        if(node==null)
            return;

        prettyDisplay(node.right,level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|-------"+node.value);
        }
        else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1);
    }

    private void preOrder(Node node){
        if(node==null)
            return;
        System.out.print(node.value + "->");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void preOrder(){
        preOrder(root);
    }

    private void inOrder(Node node){
        if(node==null)
            return;
        inOrder(node.left);
        System.out.print(node.value+"->");
        inOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }

    private void postOrder(Node node){
        if(node==null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+"->");
    }

    public void postOrder(){
        postOrder(root);
    }

    public static class Node{
        int value;
        Node left;
        Node right;
        int height;
        Node(int val){
            this.value=val;
        }
    }


}
