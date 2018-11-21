package catho;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void playersParamsTest() {
        Game newGame = new Game();
        Game.Player playerOne = newGame.getFp();
        assertEquals(playerOne.toString(),"Name=JEAN");
        Game.Player playerTwo = newGame.getSp();
        assertEquals(playerTwo.toString(),"Name=PAUL");
    }

    @Test
    public void firstScenarioTest() {
        Game newGame = new Game();
        newGame.move("WP6","F4", "white");
        newGame.move("BP5","E6", "black");
        newGame.move("WP7","G4", "white");
        newGame.move("BQ1","E7", "black");
        newGame.move("BQ1","H4", "black");
        newGame.move("WN2","F3", "white");
        newGame.move("BB2","E7", "black");
        newGame.move("WK1","F2", "white");
        newGame.move("WK1","F4", "white");
        newGame.printBoard();
    }

    @Test
    public void listPieces() {
        Game newGame = new Game();
        newGame.listPieces();
        ArrayList<Piece> pieces = newGame.getBoard().getPieces();
        for (Piece piece : pieces) {
            if (piece.toString().equals("WK1")) {
                assertEquals(piece.getRepresentation(), "\u2654");
            }
        }
    }
}