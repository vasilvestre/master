package catho;

import org.junit.Test;

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
        newGame.move("BQ","H4", "black");
        newGame.move("WN2","F3", "white");
        newGame.move("BB2","E7", "black");
    }
}