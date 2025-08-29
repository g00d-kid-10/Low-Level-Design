package tic_tac_toe;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Player O:");
        String p1Name = sc.nextLine();
        System.out.println("Enter name of Player X:");
        String p2Name = sc.nextLine();

        Player p1 = new Player(p1Name, Piece.O);
        Player p2 = new Player(p2Name, Piece.X);

        System.out.println("Enter grid size:");
        int size = sc.nextInt();

        TicTacToe game = new TicTacToe(p1, p2, size);
        new TicTacToeGUI(game);
        sc.close();
    }
}
