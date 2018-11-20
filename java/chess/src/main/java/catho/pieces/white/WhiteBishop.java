package catho.pieces.white;

import catho.Coordinate;
import catho.pieces.Bishop;

public class WhiteBishop extends Bishop {
    private static Integer instanceNumber = 0;

    public WhiteBishop(String name, String representation) {
        super(name, representation, ++instanceNumber);
    }
}
