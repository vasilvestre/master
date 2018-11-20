package catho.pieces.black;

import catho.Piece;
import catho.pieces.Knight;

public class BlackKnight extends Knight {
    private static Integer instanceNumber = 0;

    public BlackKnight(String name, String representation) {
        super(name, representation, ++instanceNumber);
    }
}
