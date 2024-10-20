package Array;

import java.util.Arrays;

public class LinearSearch2D {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                {4,5,6}};
        System.out.println(Arrays.toString(linSearch(arr,4)));
    }

    public static int[] linSearch(int[][] arr, int target){
        for(int row = 0; row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                if(arr[row][col]==target)
                    return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
}
