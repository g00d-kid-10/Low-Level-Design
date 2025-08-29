package tic_tac_toe;

import java.util.ArrayList;
import java.util.List;

class Board {
    private final int size;
    private final Piece[][] grid;
    private boolean win;

    Board(int size) {
        this.size = size;
        this.win = false;
        grid = new Piece[this.size][this.size];
    }
    
    public Piece[][] getGrid() {
        Piece[][] gridCopy = new Piece[size][size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                gridCopy[i][j] = grid[i][j];
            }
        }
        return gridCopy;
    }

    public int getSize() {
        return size;
    }

    public Piece getCell(int r, int c) {
        return grid[r][c];
    }

    public void setCell(int r, int c, Piece type) {
        if(r < 0 || r >= size || c < 0 || c >= size || grid[r][c] != null) {
            throw new IllegalStateException("invalid move");
        }

        grid[r][c] = type;
        
        if(winMove(r, c, type)) {
            win = true;
        }
    }

    public boolean isWin() {
        return win;
    }

    public boolean isGameOver() {
        return blankSpot().isEmpty() || win;
    }

    public List<int[]> blankSpot() {
        List<int[]> blanks = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(grid[i][j] == null) {
                    blanks.add(new int[]{i, j});
                }
            }
        }

        return blanks;
    }

    public boolean winMove(int r, int c, Piece currPlayer) {
        boolean row = true;
        boolean col = true;
        boolean dia = true;
        boolean adia = true;

        // row
        for(int i = 0; i < size; i++) {
            if(grid[r][i] == null || grid[r][i] != currPlayer) {
                row = false;
            }
        }

        // col
        for(int i = 0; i < size; i++) {
            if(grid[i][c] == null || grid[i][c] != currPlayer) {
                col = false;
            }
        }

        // dia
        for(int i = 0; i < size; i++) {
            if(grid[i][i] == null || grid[i][i] != currPlayer) {
                dia = false;
            }
        }

        // antidia
        for(int i = 0; i < size; i++) {
            if(grid[i][size - i - 1] == null || grid[i][size - i - 1] != currPlayer) {
                adia = false;
            } 
        }

        return row || col || dia || adia;
    }
}