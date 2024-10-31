package Generics;

public class Test {
    public static void main(String[] args) {
        try{
            int result = calculate();
            System.out.println("REstult "+result);
        }
        catch (Exception e){
            System.out.println("Exception caught"+e);
        }
    }

    public static int calculate(){
        try{
            throw new RuntimeException("Error in calculate");
        }
        finally {
            return 45;
        }
    }
}
