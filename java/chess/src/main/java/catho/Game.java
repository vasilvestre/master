package catho;

class Game {
    private Board board = new Board();
    private Player fp; // First player
    private Player sp; // Second player

    Game() {
        this.fp = new Player("JEAN", "white");
        this.sp = new Player("PAUL", "black");
    }

    public Player getFp() {
        return fp;
    }

    public Player getSp() {
        return sp;
    }

    void printBoard(){
        board.print();
    }

    public void listPieces() {
        for (Piece piece: board.getPieces()) {
            System.out.println(piece.toString());
        }
    }

    public void move(String pieceName, String to) {
        board.move(pieceName, to);
    }

    public class Player {
        private String name;
        private String color;

        Player(String name, String color) {
            this.name = name;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Name=" + name;
        }
    }
}
