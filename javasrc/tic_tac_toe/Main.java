package tic_tac_toe;

class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe("Shubham", "Mukul", "X", 3);
        String result = game.start();
        System.out.println(result);
    }
}
