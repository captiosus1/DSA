import java.util.ArrayList;
import java.util.List;

public class TargetValue {
    public static void main(String[] args) {
        int[] arr = {1,1,2,5,1,4,8,1,1};
        System.out.println(matche(arr,1,0).toString());

    }

    public static ArrayList<Object> matche(int[] arr, int target, int index){
        ArrayList<Object> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target) {
            list.add(index);
        }
        list.addAll(matche(arr, target, index+1));

        return list;
    }
}
