package catho.pieces.white;

import catho.Piece;
import catho.pieces.King;

public class WhiteKing extends King {
    private static Integer instanceNumber = 0;

    public WhiteKing(String name, String representation) {
        super(name, representation, ++instanceNumber);
    }
}
