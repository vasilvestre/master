package catho.pieces.white;

import catho.Piece;
import catho.pieces.Pawn;

public class WhitePawn extends Pawn {
    private static Integer instanceNumber = 0;

    public WhitePawn(String name, String representation) {
        super(name, representation, ++instanceNumber);
    }
}
