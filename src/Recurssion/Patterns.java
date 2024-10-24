package Recurssion;

import java.util.ArrayList;
import java.util.Arrays;

public class Patterns {
    public static void main(String[] args) {
        patternTriangle(4, 0);
        patternTrianglenormal(4, 0);
        int[] arr = {4,3,2,5,10,15,2,18,9,61};
        selectionsort(arr.length-1,0,arr,0);
    }


    public static void selectionsort(int row, int col, int[] arr, int max) {
        if (row == 0) {
            System.out.println();
            System.out.println(Arrays.toString(arr));
            return;
        }

        if (row >= col) {
            if (arr[col] > arr[max]) {
                max = col;
            }
            selectionsort(row, col + 1, arr, max);
        } else {
           int temp = arr[row];
           arr[row]= arr[max];
           arr[max] = temp;
            selectionsort(row - 1, 0, arr,0);
        }
    }

    public static void bubbleSort(int row, int col, int[] arr){
        if(row==0){
            System.out.println();
            System.out.println(Arrays.toString(arr));
            return;
        }

        if(row>col){
            if(arr[col]>arr[col+1]){
                int temp = arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
            bubbleSort(row,col+1,arr);
        }
        else{
            bubbleSort(row-1,0,arr);
        }
    }

    public static void patternTriangle(int row, int col){
        if(row==0)
            return;
        if(row>col&&row>0){
            System.out.print("* ");
            patternTriangle(row,col+1);
        }
        else{
            System.out.println();
            patternTriangle(row-1,0);
        }
    }


    public static void patternTrianglenormal(int row, int col){
        if(row==0)
            return;
        if(row>col&&row>0){
            patternTrianglenormal(row,col+1);
            System.out.print("* ");
        }
        else{
            patternTrianglenormal(row-1,0);
            System.out.println();
        }
    }
}
