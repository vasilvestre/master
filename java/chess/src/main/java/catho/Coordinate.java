package catho;

import catho.pieces.black.*;
import catho.pieces.white.*;

import java.util.Arrays;

public class Coordinate {
    private String horizontalAxis;
    private Integer verticalAxis;

    public Piece piece = null;

    public Coordinate(String horizontalAxis, Integer verticalAxis) {
        this.horizontalAxis = horizontalAxis;
        this.verticalAxis = verticalAxis;
        addPiece(horizontalAxis + verticalAxis);
    }

    private void addPiece(String coordinateName) {
        String[] numbersWithPiece = {"1", "2", "7", "8"};
        // We verify that the coordinate can have a piece on it
        if (Arrays.asList(numbersWithPiece).contains(coordinateName.substring(1))) {
            String[] blackRookPositions = {"A8", "H8"};
            String[] whiteRookPositions = {"A1", "H1"};
            String[] blackKnightPositions = {"B8", "G8"};
            String[] whiteKnightPositions = {"B1", "G1"};
            String[] blackBishopPositions = {"C8", "F8"};
            String[] whiteBishopPositions = {"C1", "F1"};
            if (Arrays.asList(blackRookPositions).contains(coordinateName)) {
                this.piece = new BlackRook("BR", "\u265C");
            }
            if (Arrays.asList(whiteRookPositions).contains(coordinateName)) {
                this.piece = new WhiteRook("WR", "\u2656");
            }
            if (Arrays.asList(blackKnightPositions).contains(coordinateName)) {
                this.piece = new BlackKnight("BN", "\u265A");
            }
            if (Arrays.asList(whiteKnightPositions).contains(coordinateName)) {
                this.piece = new Whiteknight("WN", "\u2658");
            }
            if (Arrays.asList(blackBishopPositions).contains(coordinateName)) {
                this.piece = new BlackBishop("BB", "\u265D");
            }
            if (Arrays.asList(whiteBishopPositions).contains(coordinateName)) {
                this.piece = new WhiteBishop("WB", "\u2657");
            }
            if (coordinateName.equals("E8")) {
                this.piece = new BlackKing("BK", "\u265A");
            }
            if (coordinateName.equals("E1")) {
                this.piece = new WhiteKing("WK", "\u2654");
            }
            if (coordinateName.equals("D8")) {
                this.piece = new BlackQueen("BQ", "\u265B");
            }
            if (coordinateName.equals("D1")) {
                this.piece = new WhiteQueen("WQ", "\u2655");
            }
            if (coordinateName.substring(1).equals("7")) {
                this.piece = new BlackPawn("BP","\u265F");
            }
            if (coordinateName.substring(1).equals("2")) {
                this.piece = new WhitePawn("WP","\u2659");
            }
        } else {
            this.piece = null;
        }
    }

    public String getRepresentation() {
        String contain = "  ";
        if (piece != null) {
            return contain + piece.getRepresentation();
        }
        return contain + " ";
    }

    public String getHorizontalAxis() {
        return horizontalAxis;
    }

    public Integer getVerticalAxis() {
        return verticalAxis;
    }

    @Override
    public String toString() {
        return horizontalAxis + verticalAxis;
    }

    public Integer toInteger() {
        return Integer.parseInt(horizontalAxis + verticalAxis);
    }
}