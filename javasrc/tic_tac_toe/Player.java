package tic_tac_toe;

class Player {
    private final String name;
    private final Piece type;

    Player(String name, Piece type) {
        this.name = name; this.type = type;
    }

    public String getName() {
        return name;
    }

    public Piece getPiece() {
        return type;
    }

    public void playMove(int r, int c, Board board) {        
        board.setCell(r, c, type);
    }
}   