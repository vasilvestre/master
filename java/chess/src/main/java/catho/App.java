package catho;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Game game = new Game();
        game.printBoard();
        //game.listPieces();
        //game.move("WP1","A3");
        Game.Player fp = game.getFp();
        Game.Player sp = game.getSp();

        while (!game.finished) {
            boolean allowedMove = false;
            while (!allowedMove) {
                System.out.println("Jouer 1, quel piece voulez vous jouer ?");
                Scanner scanner = new Scanner(System.in);
                String piece = scanner.nextLine();
                System.out.println("Vers quelle case ?");
                String square = scanner.nextLine();
                allowedMove = game.move(piece,square, fp.color);
            }
            game.printBoard();
            allowedMove = false;
            while (!allowedMove) {
                System.out.println("Jouer 2, quel piece voulez vous jouer ?");
                Scanner scanner = new Scanner(System.in);
                String piece = scanner.nextLine();
                System.out.println("Vers quelle case ?");
                String square = scanner.nextLine();
                allowedMove = game.move(piece,square, sp.color);
            }
            game.printBoard();
        }
    }
}
