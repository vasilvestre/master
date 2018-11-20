package catho;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
        game.printBoard();
        //game.listPieces();
        game.move("WP1","A3");
    }
}
