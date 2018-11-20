package catho.pieces.black;

import catho.Piece;

public class BlackPawn extends Piece {
    private static Integer instanceNumber = 0;

    public BlackPawn(String name, String representation) {
        super(name, representation, ++instanceNumber);
    }
}
