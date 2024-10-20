package Baktracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3,0));
//        System.out.println(countalt(3,3,0));
//        paths("",3,3);
//        System.out.println(allpaths("",3,3));
//        System.out.println(diagonalPaths("",0,0,3,3));

        int[][] route = {
                {0,  0,  0},
                {0,  0, 0},
                {0, 0,  0},
        };

        System.out.println(arrdiagonalPaths("",0,0,route,1));
    }

    public static ArrayList<String> arrdiagonalPaths(String path, int r, int c,int[][] arr,int level) {
        ArrayList<String> paths = new ArrayList<>();
        int mr=arr.length;
        int mc=arr[0].length;

        if(arr[r][c]!=0)
            return paths;
        if(r==mr-1&&c==mc-1){
            arr[r][c]=level;
            for(int[] nums: arr) {
                for (int num : nums)
                    System.out.print(num);
                System.out.println();
            }
            arr[r][c]=0;
            System.out.println();
            System.out.println(path);
            paths.add(path);
            return paths;
        }
        // Move diagonally if within bounds
//        if (r < mr - 1 && c < mc - 1) {
//            paths.addAll(arrdiagonalPaths(path + 'd', r + 1, c + 1, arr));
//        }

        arr[r][c]=level;

        // Move right if within bounds
        if (r < mr - 1) {
            paths.addAll(arrdiagonalPaths(path + 'D', r + 1, c,  arr,level+1));
        }

        // Move down if within bounds
        if (c < mc - 1) {
            paths.addAll(arrdiagonalPaths(path + 'R', r, c + 1, arr,level+1));
        }

        if(r>0){
            paths.addAll(arrdiagonalPaths(path+'U',r-1,c,arr,level+1));
        }

        if(c>0){
            paths.addAll(arrdiagonalPaths(path+'L',r,c-1,arr,level+1));
        }

        arr[r][c]=0;

        return paths;

    }





    public static ArrayList<String> diagonalPaths(String path, int r, int c,int mr, int mc){

        ArrayList<String> paths = new ArrayList<>();
        if(r==mr-1&&c==mc-1){
            paths.add(path);
            return paths;
        }
        // Move diagonally if within bounds
        if (r < mr - 1 && c < mc - 1) {
            paths.addAll(diagonalPaths(path + 'd', r + 1, c + 1, mr, mc));
        }

        // Move right if within bounds
        if (r < mr - 1) {
            paths.addAll(diagonalPaths(path + 'R', r + 1, c, mr, mc));
        }

        // Move down if within bounds
        if (c < mc - 1) {
            paths.addAll(diagonalPaths(path + 'D', r, c + 1, mr, mc));
        }

        return paths;
    }


    public static ArrayList<String> allpaths(String path, int r, int c){
        ArrayList<String> paths = new ArrayList<>();
        if(r==1&&c==1){
            paths.add(path);
            return paths;
        }

        if(r>1)
            paths.addAll(allpaths(path+'R',r-1,c));
        if(c>1)
            paths.addAll(allpaths(path+'D',r,c-1));
        return paths;
    }

    public static void paths(String path, int r, int c){

        if(r==1&&c==1){
            System.out.println(path);
            return;
        }

        if(r>1)
            paths(path+'R',r-1,c);
        if(c>1)
            paths(path+'D',r,c-1);
    }

    public static int count(int r,int c,int count){
        if(r==1&&c==1){
            count++;
            return count;
        }
        int left=0,right=0;

        if(r>1) {
            left = count(r - 1, c, count);
        }
        if(c>1) {
             right = count(r,c-1,count);
        }
        return left +right;
    }

    public static int countalt(int r,int c,int count){
        if(r==1||c==1){
            count++;
            return count;
        }
        int left = countalt(r - 1, c, count);
        int right = countalt(r,c-1,count);

        return left +right;
    }
}


