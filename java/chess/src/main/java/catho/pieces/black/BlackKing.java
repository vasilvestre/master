package catho.pieces.black;

import catho.Coordinate;
import catho.Piece;
import catho.pieces.King;

public class BlackKing extends King   {
    private static Integer instanceNumber = 0;

    public BlackKing(String name, String representation) {
        super(name, representation, ++instanceNumber, "black");
    }
}
