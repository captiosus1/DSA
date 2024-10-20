package Baktracking;

public class Nknights {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println(nKights(4,0,0,board));
    }

    public static int nKights(int n, int temp, int r, boolean[][] board){
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
                count= count+nKights(n, temp+1, r+1, board);  // Continue to place queens
                board[r][i] = false;  // Backtrack and remove the queen
            }


        }
        return count;
    }

    public static boolean isSafe(boolean[][] board,int r,int c){
//        if(r+2<board.length){
//            if(c+1<board[0].length)
//                if(board[r+2][c+1])
//                    return false;
//            if((c-1)>=0)
//                if(board[r+2][c-1])
//                    return false;
//        }

        if(r-2>=0){
            if(c+1<board[0].length)
                if(board[r-2][c+1])
                    return false;
            if((c-1)>=0)
                if(board[r-2][c-1])
                    return false;
        }

        if(r-1>=0){
            if(c+2<board[0].length)
                if(board[r-1][c+2])
                    return false;
            if((c-2)>=0)
                if(board[r-1][c-2])
                    return false;
        }

//        if(c+2<board[0].length){
//            if(r+1<board.length)
//                if(board[r+1][c+2])
//                    return false;
//            if(r-1>=0)
//                if(board[r-1][c+2])
//                    return false;
//        }
//
//        if(c-2>=0){
//            if(r+1<board.length)
//                if(board[r+1][c+2])
//                    return false;
//            if(r-1>=0)
//                if(board[r-1][c+2])
//                    return false;
//        }
        return true;
    }

    public static void printBoard(boolean[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j])
                    System.out.print("K ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }

        System.out.println();
    }
}

