package tic_tac_toe;

class Main {
    public static void main(String[] args) {

        Player p1 = new Player("Shubham", Piece.X);
        Player p2 = new Player("Animesh", Piece.O);
        int size = 3;

        TicTacToe game = new TicTacToe(p1, p2, size);
        new TicTacToeGUI(game);
    }
}
