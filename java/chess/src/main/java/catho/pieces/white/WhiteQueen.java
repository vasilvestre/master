package catho.pieces.white;

import catho.Coordinate;
import catho.Piece;
import catho.pieces.Queen;

public class WhiteQueen extends Queen {
    private static Integer instanceNumber = 0;

    public WhiteQueen(String name, String representation) {
        super(name, representation, ++instanceNumber);
    }
}
