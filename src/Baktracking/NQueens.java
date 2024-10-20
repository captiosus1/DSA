package Baktracking;

public class NQueens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[8][8];
        System.out.println(nQueens(8,0,0,board));
    }

    public static int nQueens(int n, int temp, int r, boolean[][] board){
        if(n==temp) {
            printBoard(board);
            return 1;
        }

        if(r>board.length)
            return 0;
        int count =0;

        for(int i=0;i<board[0].length;i++){
            if(isSafe(board, r, i)){
                board[r][i] = true;  // Place the queen
                count= count+nQueens(n, temp+1, r+1, board);  // Continue to place queens
                board[r][i] = false;  // Backtrack and remove the queen
            }

        }
        return count;
    }

    public static boolean isSafe(boolean[][] board,int r,int c){
        for(int i=0;i<r;i++)
            if(board[i][c])
                return false;

        int maxLeft = Math.min(r,c);
        for(int i=1;i<=maxLeft;i++){
            if(board[r-i][c-i])
                return false;
        }

        int maxRight = Math.min(r,board[0].length-c-1);
        for(int i=1;i<=maxRight;i++){
            if(board[r-i][c+i])
                return false;
        }
        return true;
    }

    public static void printBoard(boolean[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j])
                    System.out.print("Q ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
