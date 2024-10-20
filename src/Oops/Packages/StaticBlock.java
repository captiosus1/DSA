package Oops.Packages;

public class StaticBlock {
    static int num1 = 5;
    static int num2 = 7;
    static int sum;

    static {
        System.out.println("I am in Static Block");
        StaticBlock.sum = StaticBlock.num1+StaticBlock.num2;
    }

    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock();
        System.out.println(StaticBlock.sum);

        StaticBlock.sum=0;
        System.out.println(StaticBlock.sum);
        StaticBlock sb2 = new StaticBlock();
        System.out.println(StaticBlock.sum);
    }
}
