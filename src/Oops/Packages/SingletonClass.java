package Oops.Packages;

public class SingletonClass {
    public static void main(String[] args) {
        Singleton single = Singleton.getInstance();
        System.out.println(single.num);
    }
}
