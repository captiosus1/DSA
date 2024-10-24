package Access;

public class Child2 extends Parent {

    public Child2(int nump) {
        super( nump);
    }

    public static void main(String[] args) {
        Parent obj = new Child2(6);
        System.out.println(obj.getNum());

    }
}
