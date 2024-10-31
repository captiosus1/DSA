package LambdaFunctions;

public class Main {
    public static void main(String[] args) {
        Operation sum = (a, b) -> a+b;
        Operation product = ((a, b) -> a*b);
        Operation difference = (a, b) -> a-b;

        Main myCalculator = new Main();
        System.out.println(myCalculator.operator(1,2,sum));;
        System.out.println(myCalculator.operator(4,5,product));;
        System.out.println(myCalculator.operator(8,4,difference));;

    }

    private int operator(int a, int b, Operation op){
        return op.operate(a, b);

    }
}

interface Operation{
    int operate(int a, int b);
}
