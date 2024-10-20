package Oops.Packages;

//allows to create only one instance of the class
class Singleton {
     int num;
    private Singleton(){
        num=10;
    }

    static Singleton instance;

    public static Singleton getInstance(){
        if(instance==null)
            instance = new Singleton();
        return instance;
    }
}


