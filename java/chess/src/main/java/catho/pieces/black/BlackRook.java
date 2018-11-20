package catho.pieces.black;

import catho.Piece;
import catho.pieces.Rook;

public class BlackRook extends Rook {
    private static Integer instanceNumber = 0;

    public BlackRook(String name, String representation) {
        super(name, representation, ++instanceNumber);
    }
}
