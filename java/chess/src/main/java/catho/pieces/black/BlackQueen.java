package catho.pieces.black;

import catho.Piece;
import catho.pieces.Queen;

public class BlackQueen extends Queen {
    private static Integer instanceNumber = 0;

    public BlackQueen(String name, String representation) {
        super(name, representation, ++instanceNumber);
    }
}
