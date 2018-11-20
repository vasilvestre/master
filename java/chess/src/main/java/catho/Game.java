package catho;

import java.util.Map;

class Game {
    private Board board = new Board();
    private Player fp; // First player
    private Player sp; // Second player

    Game() {
        this.fp = new Player("JEAN", "white");
        this.sp = new Player("PAUL", "black");
    }

    void printBoard(){
        board.print();
    }

    public void listPieces() {
        for (Piece piece: board.getPieces()) {
            System.out.println(piece.toString());
        }
    }

    public void move(String piece, String to) {
        board.move(piece, to);
    }

    private class Player {
        Player(String name, String color) {
            this.name = name;
            this.color = color;
        }
        private String name;
        private String color;
    }
}
