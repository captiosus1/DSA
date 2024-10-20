package Oops.Packages;

public class InnerClasses {
    static class Test{
        int num;
        Test(int num){
            this.num=num;
        }
    }

    public static void main(String[] args) {
        Test a = new Test(5);
        System.out.println(a.num);
    }


//    class Test{
//        int num;
//        Test(int num){
//            this.num=num;
//        }
//    }
//
//    public static void main(String[] args) {
//        InnerClasses ineer = new InnerClasses();
//        InnerClasses.Test a = ineer.new Test(1);
//        System.out.println(a.num);
//    }
}
