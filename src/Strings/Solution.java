package Strings;

public class Solution {
    public static int minChanges(String s) {
        int totalCount=0;
        int div = largestDivisor(s.length());
        int count=0;
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch=='0')
                count++;
            i++;
            if((i)%div==0){
                count=Math.min(count, div-count);
                totalCount=totalCount+count;
                count=0;
            }
        }
        return totalCount;
    }

    public static int largestDivisor(int n) {
        if (n % 2 == 0) {
            return n / 2;
        }
        final int sqrtn = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrtn; i += 2) {
            if (n % i == 0) {
                return n / i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        String s="1010";
        System.out.println(minChanges(s));

    }
}
