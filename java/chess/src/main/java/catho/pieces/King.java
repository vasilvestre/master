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
                && Integer.parseInt(fromCoordinate.getHorizontalAxis()) - Integer.parseInt(toCoordinate.getHorizontalAxis()) <= 1
        ) {
            return true;
        }
        return false;
    }
}
