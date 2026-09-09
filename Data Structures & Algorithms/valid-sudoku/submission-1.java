class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet[] rows = new HashSet[9];
        HashSet[] cols = new HashSet[9];
        HashSet[] boxes = new HashSet[9];

        for(int i = 0; i < 9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int i = 0; i < 9; i++){

                
            for(int x = 0; x < 9; x++){

                if(board[i][x] =='.') continue;

                int box = (i/3) * 3 +(x/3);

                if(boxes[box].contains(board[i][x])){
                    return false;
                }else{
                    boxes[box].add(board[i][x]);
                }
                
                if(rows[i].contains(board[i][x])){
                    return false;
                }else{
                    rows[i].add(board[i][x]);
                }


                if(cols[x].contains(board[i][x])){
                    return false;
                }else{
                    cols[x].add(board[i][x]);
                }

                
            }


        }

        return true;


    }
}




