import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class temp {
    public static void main(String[] args) {
        String s1 = "Indra";
        String s2 = s1;
        s1="hello";
        System.out.println(s2);
        String[] arr = {"name1","name2","name3"};
        String[] arr2 = arr;
        arr[0]="name new";
        System.out.println(Arrays.toString(arr2));
        List<Object> list = new ArrayList<>();
        list.add("string");
        list.add(454);
        Date date = new Date(20240412);
        Date date2 = date;
        date2.setDate(20242485);
    }
}
