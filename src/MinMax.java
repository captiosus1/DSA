public class MinMax {
    public static void main(String[] args) {
//        int[] arr = {1, 4, 45, 6, 10, -8};
//        System.out.println(min(arr,arr.length-1,Integer.MAX_VALUE));
//        System.out.println(max(arr,arr.length-1,Integer.MIN_VALUE));
        int n=536870912;
        System.out.println((Math.log(n)/Math.log(2))%1);

    }
    public static int min(int[] arr, int n, int min) {
        if(n<0)
            return min;
        if(arr[n]<min)
            return min(arr, n-1, arr[n]);
        return min(arr, n-1, min);
    }
    public static int max(int[] arr, int n, int max) {
        if(n<0)
            return max;
        if(arr[n]>max)
            return max(arr, n-1, arr[n]);
        return max(arr, n-1, max);
    }
}
