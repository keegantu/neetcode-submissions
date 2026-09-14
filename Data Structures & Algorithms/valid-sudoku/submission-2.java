class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for(int i = 0; i < 9; i++){
            Set<Character> row = new HashSet<>();
            rows[i] = row;
        }

        for(int i = 0; i < 9; i++){
            Set<Character> col = new HashSet<>();
            cols[i] = col;
        }

        for(int i = 0; i < 9; i++){
            Set<Character> box = new HashSet<>();
            boxes[i] = box;
        }

        for(int i = 0; i < board.length; i++){

            for(int j = 0; j < board.length; j++){
                if(board[i][j] == '.') continue;
                if(rows[i].contains(board[i][j])  || cols[j].contains(board[i][j]) || boxes[(i/3 
                * 3 + j/3)].contains(board[i][j])){
                    return false;
                }else{
                    rows[i].add(board[i][j]);
                    cols[j].add(board[i][j]);
                    boxes[(i/3 * 3 + j/3)].add(board[i][j]);
                }
            }
        }

        return true;
    }
}

