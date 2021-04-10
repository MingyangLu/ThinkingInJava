package com.cywri.main;

class Solution {

    public static void main(String[] args){
        char[][] chars = new char[][]{{'a','a'}};
        boolean is = exist(chars,"aaa");
    }

    public static boolean exist(char[][] board, String word) {
        int xlen = board.length;
        int ylen = board[0].length;
        int x = 0, y = 0;

        for(int i = 0; i < xlen; i++){
            for(int j = 0; j < ylen; j++){
                if(board[i][j] == word.charAt(0)){
                    char[][] tmpboard = board;
                    tmpboard[i][j] = ' ';
                    if(word.length() == 1){
                        return true;
                    }else {
                        x = i;
                        y = j;
                        for(int k = 1; k < word.length(); k++){
                            int[] next = neighbourExist(tmpboard, x, y, word.charAt(k));
                            if(next[0] == -1){
                                break;
                            } else{
                                x = next[0]; y = next[1];
                                tmpboard[x][y] = ' ';
                            }
                            if(k == word.length() -1) return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static int[] neighbourExist(char[][] board, int x, int y, char currentLabel){
        int xlen = board.length;
        int ylen = board[0].length;
        if((x-1) >=0 && board[x-1][y] == currentLabel){
            return new int[]{x-1,y};
        }
        if((y-1) >=0 && board[x][y-1] == currentLabel){
            return new int[]{x,y-1};
        }
        if((x+1) < xlen && board[x+1][y] == currentLabel){
            return new int[]{x+1,y};
        }
        if((y+1) < ylen && board[x][y+1] == currentLabel){
            return new int[]{x,y+1};
        }
        return new int[]{-1,-1};
    }
}