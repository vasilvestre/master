package catho;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void playersParamsTest() {
        Game newGame = new Game();
        Game.Player playerOne = newGame.getFp();
        assertEquals(playerOne.toString(),"Name=JEAN");
    }
}