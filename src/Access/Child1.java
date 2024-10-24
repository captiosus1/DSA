package Access;

public class Child1 extends Parent{

    public Child1(int nump) {
        super( nump);
    }

    public static void main(String[] args) {
        Parent obj = new Child1(5);
        obj.setNum(5);
        System.out.println(obj.getNum());
    }
}
