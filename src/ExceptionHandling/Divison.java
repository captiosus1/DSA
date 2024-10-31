package ExceptionHandling;

public class Divison {
    public static void main(String[] args) throws Exception {
        int a=5, b=0;
        System.out.println(divide(4,5));
    }

    public static float divide(int a,int b) throws Exception{
//        if(b==0)
//            throw new Exception("B=0, gives infinite. please change denominator");
        return a /b;
    }
}
