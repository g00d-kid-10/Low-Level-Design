package tic_tac_toe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGUI extends JFrame {
    private final TicTacToe game;
    private final JButton[][] buttons;
    private final JLabel statusLabel;

    public TicTacToeGUI(TicTacToe game) {
        this.game = game;
        this.buttons = new JButton[game.getBoard().getSize()][game.getBoard().getSize()];
        this.statusLabel = new JLabel("Turn: " + game.getCurrentPlayer().getName());

        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Game board
        JPanel boardPanel = new JPanel(new GridLayout(game.getBoard().getSize(), game.getBoard().getSize()));
        for (int r = 0; r < game.getBoard().getSize(); r++) {
            for (int c = 0; c < game.getBoard().getSize(); c++) {
                JButton button = new JButton("");
                button.setFont(new Font("Arial", Font.BOLD, 40));
                final int row = r;
                final int col = c;
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (button.getText().isEmpty() && !game.isGameOver()) {
                            game.makeMove(row, col);
                            button.setText(game.getBoard().getCell(row, col).toString());
                            if (game.isGameOver()) {
                                if (game.getWinner() != null) {
                                    statusLabel.setText("Winner: " + game.getWinner().getName());
                                } else {
                                    statusLabel.setText("It's a draw!");
                                }
                            } else {
                                statusLabel.setText("Turn: " + game.getCurrentPlayer().getName());
                            }
                        }
                    }
                });
                buttons[r][c] = button;
                boardPanel.add(button);
            }
        }

        add(statusLabel, BorderLayout.NORTH);
        add(boardPanel, BorderLayout.CENTER);

        setSize(400, 400);
        setVisible(true);
    }
}
