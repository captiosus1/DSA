package Recurssion;

import java.util.ArrayList;
import java.util.List;

public class MobilePad {
    public static void main(String[] args) {
        System.out.println(pad("","12"));
    }

    public static List<String> pad(String p, String up){
        List<String> result = new ArrayList<>();
        if(up.isEmpty()){
            result.add(p);
            return result;
        }

        int range = up.charAt(0)-'0';
        for(int i=(range-1)*3;i<range*3;i++){
            char ch= (char) ( i+'a');
            result.addAll(pad(p+ch,up.substring(1)));
        }

        return result;

    }
}
