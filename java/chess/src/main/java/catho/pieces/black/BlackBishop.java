package catho.pieces.black;

import catho.Coordinate;
import catho.Piece;

public class BlackBishop extends Piece {
    private static Integer instanceNumber = 0;

    public BlackBishop(String name, String representation) {
        super(name, representation, ++instanceNumber);
    }
}
