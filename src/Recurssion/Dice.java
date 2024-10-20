package Recurssion;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        System.out.println(dice("",7,6));
    }

    public static List<String> dice(String p, int target, int faces){
        List<String> result = new ArrayList<>();
        if(target==0){
            result.add(p);
            return result;
        }

        for(int i=1;i<=target&&i<=faces;i++){
            result.addAll(dice(p+i,target-i,faces));
        }
        return result;
    }
}
