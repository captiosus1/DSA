package Recurssion;

import java.util.ArrayList;
import java.util.List;

public class StringRecurssion {
    public static void main(String[] args) {
//        System.out.println(skipApple("abcgapphgdbjebjecjapplebnbnbhvbh"));
//        System.out.println(subStrings("abcd",""));
//        System.out.println(subStringAscii("abc",""));
//        System.out.println(subsets("abbc"));
        System.out.println(permuationCount("abc",""));
    }

//    public static List<String> permutations(String str){
//
//
//    }

    public static ArrayList permuationprint(String up,String p){
        ArrayList<String> str = new ArrayList<>();
        if(up.isEmpty()) {
            str.add(p);
            return str;
        }

        char ch=up.charAt(0);

        for(int i=0;i<=p.length();i++){
            String fs = p.substring(0,i);
            String ss = p.substring(i);
            str.addAll(permuationprint(up.substring(1),fs+ch+ss));
        }
        return str;
    }

    public static int permuationCount(String up,String p){
        int count=0;
        if(up.isEmpty()) {
            count = count+1;
            return count;
        }

        char ch=up.charAt(0);

        for(int i=0;i<=p.length();i++){
            String fs = p.substring(0,i);
            String ss = p.substring(i);
            count =count +permuationCount(up.substring(1),fs+ch+ss);
        }
        return count;
    }



    public static String skipApple(String str) {
        if(str.isEmpty())
            return str;
        char ch = str.charAt(0);
        if(str.startsWith("app")&&!str.startsWith("apple"))
            return skipApple(str.substring("app".length()));
        else
            return ch+skipApple(str.substring(1));
    }

    public static ArrayList<String> subStrings(String up, String p) {
        ArrayList<String> result = new ArrayList<>();
        if (up.isEmpty()) {
            result.add(p);
            return result; // Return the list when there are no more characters to process
        }

        char ch = up.charAt(0);
        // Recur by including the character
        result.addAll(subStrings(up.substring(1), p + ch));
        // Recur by excluding the character
        result.addAll(subStrings(up.substring(1), p));

        return result; // Return the list after processing both cases
    }

    public static ArrayList<String> subStringAscii(String up, String p) {
        ArrayList<String> result = new ArrayList<>();
        if (up.isEmpty()) {
            result.add(p);
            return result; // Return the list when there are no more characters to process
        }

        char ch = up.charAt(0);
        // Recur by including the character
        result.addAll(subStringAscii(up.substring(1), p + ch));
        // Recur by excluding the character
        result.addAll(subStringAscii(up.substring(1), p));
        result.addAll(subStringAscii(up.substring(1), p+(ch+0)));

        return result; // Return the list after processing both cases
    }

    public static List<List<String>> subsets(String arr){
        List<List<String>> outer = new ArrayList<>();
        List<String> inner = new ArrayList<>();
        outer.add(inner);
        int start =0, n=0;

        for(int i=0; i<arr.length(); i++){
            start=0;
            char ch = arr.charAt(i);

            if(i>0&&ch==arr.charAt(i-1))
                start=n;
            n=outer.size();

            for(int j=start;j<n;j++){
                List<String> newInner = new ArrayList<>(outer.get(j));
                newInner.add(ch+"");
                outer.add(newInner);
            }
        }
        return outer;
    }
}
