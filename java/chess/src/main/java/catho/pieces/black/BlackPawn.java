package catho.pieces.black;

import catho.Coordinate;
import catho.Piece;

public class BlackPawn extends Piece  {
    private static Integer instanceNumber = 0;

    public BlackPawn(String name, String representation) {
        super(name, representation, ++instanceNumber, "black");
    }

    @Override
    public boolean canMove(Coordinate fromCoordinate, Coordinate toCoordinate) {
        if (moveToDifferentPosition(fromCoordinate, toCoordinate)
                && fromCoordinate.getHorizontalAxis().equals(toCoordinate.getHorizontalAxis())
                && fromCoordinate.getVerticalAxis() > toCoordinate.getVerticalAxis()
                && (fromCoordinate.getVerticalAxis() - toCoordinate.getVerticalAxis()) <= 2) {
            return true;
        }
        return false;
    }
}
