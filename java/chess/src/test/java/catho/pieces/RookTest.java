package catho.pieces;

import catho.Coordinate;
import catho.Piece;
import org.junit.Test;

import static org.junit.Assert.*;

public class RookTest {

    @Test
    public void canMove() {
        Coordinate fromCoordinate = new Coordinate("A",8);
        Coordinate toCoordinate = new Coordinate("H",8);
        Rook piece = (Rook) fromCoordinate.piece;
        boolean canMove = false;
        if (piece.moveToDifferentPosition(fromCoordinate, toCoordinate) && (
                (fromCoordinate.getHorizontalAxis().equals(toCoordinate.getHorizontalAxis()) && !fromCoordinate.getVerticalAxis().equals(toCoordinate.getVerticalAxis()))
                        || fromCoordinate.getVerticalAxis().equals(toCoordinate.getVerticalAxis()) && !fromCoordinate.getHorizontalAxis().equals(toCoordinate.getHorizontalAxis())
        )) {
            canMove = true;
        }
        assertTrue(canMove);
    }
}