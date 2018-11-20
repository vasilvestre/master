package catho.pieces.white;

import catho.Coordinate;
import catho.Piece;
import catho.pieces.Knight;

public class Whiteknight extends Knight {
    private static Integer instanceNumber = 0;

    public Whiteknight(String name, String representation) {
        super(name, representation, ++instanceNumber);
    }

}
