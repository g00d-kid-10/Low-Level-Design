package tic_tac_toe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class TicTacToe {
    String player1, player2, player1Piece;
    Deque<Player> players;
    Board board;
    private final Scanner sc;

    TicTacToe(String player1, String player2, String player1Piece, int boardSize) {
        this.player1 = player1;
        this.player2 = player2;
        this.player1Piece = player1Piece;
        this.players = new ArrayDeque<>();
        this.board = new Board(boardSize);
        this.sc = new Scanner(System.in);
    }

    public Piece[] decidePieces(String pieceType) {
        Piece[] pieces;
        if("X".equalsIgnoreCase(pieceType)) {
            pieces = new Piece[]{Piece.X, Piece.O};
        } else if("O".equalsIgnoreCase(pieceType)){
            pieces = new Piece[]{Piece.O, Piece.X};
        } else {
            throw new IllegalStateException("Choose the valid piece. Valid pieces(X, O)");
        }

        return pieces;
    }
    
    public String start() {

        Piece[] pieces = decidePieces(player1Piece);
        
        Player p1 = new Player(player1, pieces[0]);
        Player p2 = new Player(player2, pieces[1]);
        
        players.add(p1); players.add(p2);

        String result = "";
        boolean isOn = true;
        while(isOn) {
            board.printBoard();
            if(board.blankSpot().isEmpty()) {
                isOn = false;
                result = "It's a tie.";
                break;
            }
            Player currentPlayer = players.poll();
            System.out.println(currentPlayer.getName() + " your turn: enter the row, col: ");
            int r = sc.nextInt(); int c = sc.nextInt();
            
            try {
                currentPlayer.playMove(r, c, board);
                boolean win = board.winMove(r, c, currentPlayer.getPiece());
                if(win) {
                    isOn = false;
                    board.printBoard();
                    result = currentPlayer.getName() + " is winner.";
                    break;
                }
            } catch(IllegalStateException error) {
                String errMessage = error.getMessage();
                if("invalid move".equals(errMessage)) {
                    players.addFirst(currentPlayer);
                    System.out.println("Invalid move try again.");
                }
                continue;
            }

            players.add(currentPlayer);
        }
        
        sc.close();
        return result;
    }
}