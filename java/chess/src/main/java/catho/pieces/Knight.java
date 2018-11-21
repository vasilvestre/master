package catho.pieces;

import catho.Coordinate;
import catho.Piece;

public abstract class Knight extends Piece {
    public Knight(String name, String representation, Integer number, String color) {
        super(name, representation, number, color);
    }

    @Override
    public boolean canMove(Coordinate fromCoordinate, Coordinate toCoordinate) {
        int distanceBetweenVertical = toCoordinate.getVerticalAxis() - fromCoordinate.getVerticalAxis();
        int distanceBetweenHorizontal = Character.getNumericValue(toCoordinate.getHorizontalAxis().charAt(0)) - Character.getNumericValue(fromCoordinate.getHorizontalAxis().charAt(0));

        if (moveToDifferentPosition(fromCoordinate, toCoordinate)
                && ((distanceBetweenVertical == 1 && distanceBetweenHorizontal == 2) || (distanceBetweenVertical == 2 && distanceBetweenHorizontal == 1))
        ) {
            return true;
        }
        return false;
    }
}
