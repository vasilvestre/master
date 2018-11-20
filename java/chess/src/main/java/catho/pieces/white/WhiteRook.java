package catho.pieces.white;

import catho.Piece;
import catho.pieces.Rook;

public class WhiteRook extends Rook {
    private static Integer instanceNumber = 0;

    public WhiteRook(String name, String representation) {
        super(name, representation, ++instanceNumber);
    }
}
