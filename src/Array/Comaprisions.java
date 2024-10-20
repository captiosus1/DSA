package Array;

import java.util.Arrays;
import java.util.Random;

public class Comaprisions {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for(int index=0;index<20;index++){
            arr[index] = new Random().nextInt(20);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(maximumRange(arr,5,18));
    }

    public static int minimumRange(int[] arr, int start, int end){
        if(arr.length==0)
            return -1;

        int index=start+1;
        int min = arr[start];
        while(index<end){
            if(arr[index]<min)
                min = arr[index];
            index++;
        }
        return min;
    }

    public static int maximumRange(int[] arr, int start, int end){
        if(arr.length==0)
            return -1;

        int index=start+1;
        int min = arr[start];
        while(index<end){
            if(arr[index]>min)
                min = arr[index];
            index++;
        }
        return min;
    }

    public static int maximum(int[] arr){
        if(arr.length==0)
            return -1;

        int index=1;
        int min = arr[0];
        while(index<arr.length){
            if(arr[index]>min)
                min = arr[index];
            index++;
        }
        return min;
    }

    public static int minimum(int[] arr){
        if(arr.length==0)
            return -1;

        int index=1;
        int min = arr[0];
        while(index<arr.length){
            if(arr[index]<min)
                min = arr[index];
            index++;
        }
        return min;
    }
}
