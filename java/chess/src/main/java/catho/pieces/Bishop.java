package catho.pieces;

import catho.Coordinate;
import catho.Piece;

public abstract class Bishop extends Piece {
    public Bishop(String name, String representation, Integer number) {
        super(name, representation, number);
    }

    @Override
    public boolean canMove(Coordinate fromCoordinate, Coordinate toCoordinate) {
        Integer distanceBetweenVertical = toCoordinate.getVerticalAxis() - fromCoordinate.getVerticalAxis();
        Integer distanceBetweenHorizontal = Integer.parseInt(toCoordinate.getHorizontalAxis()) - Integer.parseInt(fromCoordinate.getHorizontalAxis());

        if (moveToDifferentPosition(fromCoordinate, toCoordinate)
                && distanceBetweenVertical.equals(distanceBetweenHorizontal)
        ) {
            return true;
        }
        return false;
    }
}
