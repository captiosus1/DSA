package Array;

import java.util.Arrays;
import java.util.Random;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for(int index=0;index<20;index++){
            arr[index] = new Random().nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(searchRange(arr,5,4,15));
//        System.out.println(linSearch(arr,5));

//        System.out.println(stringSearch("Indraneela",'a'));
    }


    public static int searchRange(int[] arr, int target, int start, int end){
        if(arr.length==0)
            return -1;
        int index = end;
        while(index>=start){
            if(arr[index]==target)
                return index;
            index--;
        }
        return -1;
    }

    public static int linSearch(int[] arr, int target){
        if(arr.length==0)
            return -1;
        int index=arr.length-1;
        while(index>=0){
            if(arr[index]==target)
                return index;
            index--;
        }
        return -1;
    }

    public static int stringSearch(String str, char targer){
        if(str.length()==0)
            return -1;

        int index=str.length()-1;
        while(index>=0){
            if(str.charAt(index)==targer)
                return index;
            index--;
        }
        return -1;
    }
}
