package catho.pieces;

import catho.Coordinate;
import catho.Piece;

public abstract class Rook extends Piece {
    public Rook(String name, String representation, Integer number) {
        super(name, representation, number);
    }

    @Override
    public boolean canMove(Coordinate fromCoordinate, Coordinate toCoordinate) {
        if (moveToDifferentPosition(fromCoordinate, toCoordinate) && (
                (fromCoordinate.getHorizontalAxis().equals(toCoordinate.getHorizontalAxis()) && !fromCoordinate.getVerticalAxis().equals(toCoordinate.getVerticalAxis()))
                || fromCoordinate.getVerticalAxis().equals(toCoordinate.getVerticalAxis()) && !fromCoordinate.getHorizontalAxis().equals(toCoordinate.getHorizontalAxis())
        )) {
            return true;
        }
        return false;
    }
}
