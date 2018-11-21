package catho.pieces;

import catho.Coordinate;
import catho.Piece;

public abstract class King extends Piece {
    public King(String name, String representation, Integer number, String color) {
        super(name, representation, number, color);
    }

    @Override
    public boolean canMove(Coordinate fromCoordinate, Coordinate toCoordinate) {
        if (moveToDifferentPosition(fromCoordinate, toCoordinate)
                && fromCoordinate.getVerticalAxis() - toCoordinate.getVerticalAxis() <= 1
                && Character.getNumericValue(fromCoordinate.getHorizontalAxis().charAt(0)) - Character.getNumericValue(toCoordinate.getHorizontalAxis().charAt(0)) <= 1
        ) {
            return true;
        }
        return false;
    }
}
