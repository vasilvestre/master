package catho.pieces.white;

import catho.Coordinate;
import catho.pieces.Pawn;

public class WhitePawn extends Pawn {
    private static Integer instanceNumber = 0;

    public WhitePawn(String name, String representation) {
        super(name, representation, ++instanceNumber);
    }

    @Override
    public boolean canMove(Coordinate fromCoordinate, Coordinate toCoordinate) {
        if (moveToDifferentPosition(fromCoordinate, toCoordinate)
                && fromCoordinate.getHorizontalAxis().equals(toCoordinate.getHorizontalAxis())
                && fromCoordinate.getVerticalAxis() < toCoordinate.getVerticalAxis()) {
            return true;
        }
        return false;
    }
}
