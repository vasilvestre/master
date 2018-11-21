package catho.pieces;

import catho.Coordinate;
import catho.Piece;

public abstract class Queen extends Piece {
    public Queen(String name, String representation, Integer number, String color) {
        super(name, representation, number, color);
    }

    @Override
    public boolean canMove(Coordinate fromCoordinate, Coordinate toCoordinate) {
        Integer distanceBetweenVertical = toCoordinate.getVerticalAxis() - fromCoordinate.getVerticalAxis();
        Integer distanceBetweenHorizontal = Character.getNumericValue(toCoordinate.getHorizontalAxis().charAt(0)) - Character.getNumericValue(fromCoordinate.getHorizontalAxis().charAt(0));

        if (moveToDifferentPosition(fromCoordinate, toCoordinate)
                || fromCoordinate.getVerticalAxis() - toCoordinate.getVerticalAxis() <= 1
                || Integer.parseInt(fromCoordinate.getHorizontalAxis()) - Integer.parseInt(toCoordinate.getHorizontalAxis()) <= 1
                || distanceBetweenVertical.equals(distanceBetweenHorizontal)
        ) {
            return true;
        }
        return false;
    }
}
