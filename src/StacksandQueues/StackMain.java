package StacksandQueues;

public class StackMain {
    public static void main(String[] args) throws Exception {
        CustomeStack stack = new DynamicStack(1);
        stack.push(7);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(7);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(7);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
