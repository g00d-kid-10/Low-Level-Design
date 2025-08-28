package tic_tac_toe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.InputMismatchException;

class TicTacToe {
    private Deque<Player> players;
    private Board board;
    private boolean isGameOver;

    TicTacToe(Player p1, Player p2, int boardSize) {
        this.players = new ArrayDeque<>(); this.players.add(p1); this.players.add(p2);
        this.board = new Board(boardSize);
        this.isGameOver = false;
    }

    public Board getBoard() {
        return board;
    }

    public int getSize() {
        return board.getSize();
    }

    public Piece getCell(int r, int c) {
        return board.getCell(r, c);
    }

    public Player getCurrentPlayer() {
        return players.getFirst();
    }

    public void makeMove(int r, int c) {
        Player currPlayer = players.poll();
        currPlayer.playMove(r, c, board);
        players.addLast(currPlayer);
    }

    public boolean isGameOver() {
        return board.isGameOver();
    }

    public Player getWinner() {
        if(board.isWin()) {
            return players.getFirst();
        }

        return null;
    }
}