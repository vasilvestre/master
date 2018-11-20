package catho.pieces.black;

import catho.pieces.Bishop;

public class BlackBishop extends Bishop {
    private static Integer instanceNumber = 0;

    public BlackBishop(String name, String representation) {
        super(name, representation, ++instanceNumber);
    }
}
